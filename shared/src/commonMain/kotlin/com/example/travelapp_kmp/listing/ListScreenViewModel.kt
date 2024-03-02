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
                val weather = countriesApi.getWeather(countries.first().touristPlaces[0].location)
                state.emit(
                    ListScreenState.Success(
                        countriesList = countries,
                        selectedCountry = countries.first(),
                        weatherSelectedCountry = weather
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
                    emitNewState(
                        actions,
                        countriesApi.getWeather(actions.country.touristPlaces[0].location)
                    )
                }

                is ListViewModelActions.OnItemSwiped -> {
                    onChangePlaceSelected(actions.index)
                }

                is ListViewModelActions.MoveToIndex -> {
                    onChangePlaceSelected(actions.index)
                }
            }
        }
    }

    private suspend fun onChangePlaceSelected(index: Int) {
        with(state.value as ListScreenState.Success) {
            selectedCountry.touristPlaces[selectedItemIndex].location.let {
                countriesApi.getWeather(it)
            }.let { weather ->
                state.emit(
                    this.copy(
                        selectedItemIndex = index,
                        weatherSelectedCountry = weather
                    )
                )
            }

        }
    }

    private suspend fun emitNewState(
        actions: ListViewModelActions.OnCountrySelected,
        weather: Weather
    ) {
        getStateValueWithEmptyState(state.value)?.run {
            val country = this.countriesList.first { it.name == actions.country.name }
            val latestState = this.copy(
                selectedCountry = country,
                selectedItemIndex = 0,
                weatherSelectedCountry = weather
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