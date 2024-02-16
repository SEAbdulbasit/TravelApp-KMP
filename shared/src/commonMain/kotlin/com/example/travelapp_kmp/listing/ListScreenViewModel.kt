package com.example.travelapp_kmp.listing

import com.example.travelapp_kmp.network.CountriesApiImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi

class ListScreenViewModel {
    private val viewModelScope = CoroutineScope(Dispatchers.Main)
    private val countriesApi = CountriesApiImpl()
    val state = MutableStateFlow<ListScreenState>(ListScreenState.Loading)

    init {
        fetchCountries()
    }

    fun fetchCountries(sortOrder: SortOrder = SortOrder.ASCENDING) {
        viewModelScope.launch(Dispatchers.Main) {
            try {
                val countries = getCountriesSorted(
                    countriesApi.getCountriesList(),
                    sortOrder
                )
                state.emit(
                    ListScreenState.Success(
                        countriesList = countries,
                        selectedCountry = countries.first()
                    )
                )
            } catch (e: Exception) {
                e.printStackTrace()
                state.emit(ListScreenState.Error(e.message ?: "Something went wrong"))
            }
        }
    }
    @OptIn(ExperimentalResourceApi::class)
    private fun getCountriesSorted(
        countries: List<Country>,
        sortOrder: SortOrder
    ): List<Country> {
        return if (sortOrder == SortOrder.ASCENDING) {
            countries.sortedBy { it.name }
        } else {
            countries.sortedByDescending { it.name }
        }.map { country ->
            country.copy(
                touristPlaces = country.touristPlaces.sortedBy { it.name }
            )
        }


    }
    fun onAction(actions: ListViewModelActions) {
        viewModelScope.launch {
            when (actions) {
                is ListViewModelActions.OnCountrySelected -> {
                    emitNewState(actions)
                }

                is ListViewModelActions.OnItemSwiped -> {
                    state.emit(
                        (state.value as ListScreenState.Success).copy(
                            selectedItemIndex = actions.index
                        )
                    )
                }

                is ListViewModelActions.MoveToIndex -> {
                    val previousState = (state.value as ListScreenState.Success)
                    state.emit(
                        previousState.copy(
                            selectedItemIndex = actions.index,
                        )
                    )
                }
            }
        }
    }

    private suspend fun emitNewState(actions: ListViewModelActions.OnCountrySelected) {
        getStateValueWithEmptyState(state.value)?.run {
            val country = this.countriesList.first { it.name == actions.country.name }
            val latestState = this.copy(
                selectedCountry = country,
                selectedItemIndex = 0,
            )
            state.emit(latestState)
        }
    }

    private fun getStateValueWithEmptyState(state: ListScreenState): ListScreenState.Success? {
        return when (state) {
            is ListScreenState.Error -> null
            ListScreenState.Loading -> null
            is ListScreenState.Success -> state
        }
    }


}

enum class SortOrder {
    ASCENDING,
    DESCENDING
}


sealed interface ListViewModelActions {
    data class OnCountrySelected(val country: Country) : ListViewModelActions
    data class MoveToIndex(val index: Int) : ListViewModelActions
    data class OnItemSwiped(val touristPlace: TouristPlace, val index: Int) : ListViewModelActions
}