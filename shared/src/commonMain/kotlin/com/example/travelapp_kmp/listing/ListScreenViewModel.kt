package com.example.travelapp_kmp.listing

import com.example.travelapp_kmp.network.CountriesApiImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi

class ListScreenViewModel {
    private val viewModelScope = CoroutineScope(Dispatchers.Unconfined)
    private val countriesApi = CountriesApiImpl()
    val state = MutableStateFlow<ListScreenState>(ListScreenState.Loading)

    private val weatherMap: MutableMap<Location, Weather> = mutableMapOf()

    private val _weatherState = MutableStateFlow<WeatherState>(WeatherState.Loading)
    val weatherState: StateFlow<WeatherState> = _weatherState

    init {
        fetchCountries()
    }

    fun fetchCountries(sortOrder: SortOrder = SortOrder.ASCENDING) {
        viewModelScope.launch(Dispatchers.Main) {
            try {
                val countries = getCountriesSorted(countriesApi.getCountriesList(), sortOrder)
                fetchWeather(countries.first().touristPlaces.first().location)
                state.emit(ListScreenState.Success(countriesList = countries))
            } catch (e: Exception) {
                e.printStackTrace()
                state.emit(ListScreenState.Error(e.message ?: "Something went wrong"))
            }
        }
    }

    private fun fetchWeather(location: Location) {
        viewModelScope.launch(Dispatchers.Unconfined) {
            _weatherState.emit(WeatherState.Loading)
            try {
                val weatherCache = weatherMap[location]
                if (weatherCache == null) {
                    val weather = countriesApi.getWeather(location)
                    //save in map to retrieve it easily next time
                    weatherMap[location] = weather
                    _weatherState.emit(WeatherState.Success(weatherMap[location]!!))
                } else {
                    _weatherState.emit(WeatherState.Success(weatherCache))
                }
            } catch (e: Exception) {
                _weatherState.emit(WeatherState.Error(e.message ?: "Something went wrong"))
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

    private suspend fun updateSelectedIndices(
        selectedCountryIndex: Int,
        selectedTouristPlacesIndex: Int,
    ) {
        with(state.value as ListScreenState.Success) {
            fetchWeather(countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].location)
            state.emit(
                this.copy(
                    selectedTouristPlacesIndex = selectedTouristPlacesIndex,
                    selectedCountryIndex = selectedCountryIndex,
                )
            )
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