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

    @OptIn(ExperimentalResourceApi::class)
    fun fetchCountries(sortOrder: SortOrder = SortOrder.ASCENDING) {
        viewModelScope.launch(Dispatchers.Main) {
            try {
                val countries = getCountriesSorted(
                    countriesApi.getCountriesList(),
                    sortOrder
                )

                val updatedCountriesList = countries.toMutableList()
                val currentCountry = updatedCountriesList[0]
                val updatedTouristPlaces = currentCountry.touristPlaces.toMutableList()
                updatedTouristPlaces[0] =
                    updatedTouristPlaces[0].copy(
                        weather = countriesApi.getWeather(
                            updatedTouristPlaces[0].location
                        )
                    )
                updatedCountriesList[0] = currentCountry.copy(touristPlaces = updatedTouristPlaces)

                state.emit(
                    ListScreenState.Success(
                        countriesList = updatedCountriesList,
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
                    onChangePlaceSelected(actions.index)
                }

                is ListViewModelActions.MoveToIndex -> {
                    onChangePlaceSelected(actions.index)
                }
            }
        }
    }


    private suspend fun onChangePlaceSelected(selectedTouristPlacesIndex: Int) {
        with(state.value as ListScreenState.Success) {
            updateSelectedIndices(
                selectedCountryIndex = selectedCountryIndex,
                selectedTouristPlacesIndex = selectedTouristPlacesIndex
            )
        }
    }

    @OptIn(ExperimentalResourceApi::class)
    @OptIn(ExperimentalResourceApi::class)
    private suspend fun updateSelectedIndices(
        selectedCountryIndex: Int,
        selectedTouristPlacesIndex: Int,
    ) {
        with(state.value as ListScreenState.Success) {
            if (countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].weather != null) {
                state.emit(
                    this.copy(
                        selectedTouristPlacesIndex = selectedTouristPlacesIndex,
                        selectedCountryIndex = selectedCountryIndex,
                    )
                )
            } else {
                val weather =
                    countriesApi.getWeather(countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].location)
                countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].copy(
                    weather = weather
                )
                state.update {
                    this.copy(
                        selectedTouristPlacesIndex = selectedTouristPlacesIndex,
                        selectedCountryIndex = selectedCountryIndex,
                        countriesList = countriesList
                    )
                }
            }
        }
    }
   

    private suspend fun emitNewState(
        actions: ListViewModelActions.OnCountrySelected,
    ) {
        getStateValueWithEmptyState(state.value)?.run {
            updateSelectedIndices(
                selectedCountryIndex = actions.indexCountry,
                selectedTouristPlacesIndex = 0
            )
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
    data class OnCountrySelected(val indexCountry: Int) : ListViewModelActions
    data class MoveToIndex(val index: Int) : ListViewModelActions
    data class OnItemSwiped(val touristPlace: TouristPlace, val index: Int) : ListViewModelActions
}