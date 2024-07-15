package com.example.travelapp_kmp.listing

import org.jetbrains.compose.resources.DrawableResource


sealed interface ListScreenState {
    object Loading : ListScreenState
    data class Error(val message: String) : ListScreenState
    data class Success(
        val countriesList: List<Country>,
        val selectedTouristPlacesIndex: Int = 0,
        val selectedCountryIndex: Int = 0,
    ) : ListScreenState {

        val countriesTouristPlaces: List<TouristPlace> =
            countriesList[selectedCountryIndex].touristPlaces

        val nameTouristPlaceSelected: String =
            countriesTouristPlaces[selectedTouristPlacesIndex].name

        val nameCountrySelected: String = countriesList[selectedCountryIndex].name

        fun getImagePlaceholder(): DrawableResource {
            return countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].images[0]
        }
    }
}


sealed interface WeatherState {
    data object Loading : WeatherState
    data class Error(val message: String) : WeatherState
    data class Success(val weather: Weather) : WeatherState
}