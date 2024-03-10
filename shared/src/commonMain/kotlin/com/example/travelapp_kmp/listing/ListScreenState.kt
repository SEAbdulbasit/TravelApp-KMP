package com.example.travelapp_kmp.listing

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi


sealed interface ListScreenState {
    object Loading : ListScreenState
    data class Error(val message: String) : ListScreenState
    data class Success(
        val countriesList: List<Country>,
        val selectedTouristPlacesIndex: Int = 0,
        val selectedCountryIndex: Int = 0,
    ) : ListScreenState {
        fun getWeather(): Weather? {
            return countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].weather
        }

        val countriesTouristPlaces: List<TouristPlace> =
            countriesList[selectedCountryIndex].touristPlaces

        val nameTouristPlaceSelected: String =
            countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].name

        val nameCountrySelected: String = countriesList[selectedCountryIndex].name

        @OptIn(ExperimentalResourceApi::class)
        fun getImagePlaceholder(): DrawableResource {
            return countriesList[selectedCountryIndex].touristPlaces[selectedTouristPlacesIndex].images[0]
        }

    }
}

