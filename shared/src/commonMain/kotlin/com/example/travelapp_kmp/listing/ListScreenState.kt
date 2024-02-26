package com.example.travelapp_kmp.listing


sealed interface ListScreenState {
    object Loading : ListScreenState
    data class Error(val message: String) : ListScreenState
    data class Success(
        val countriesList: List<Country>,
        val selectedCountry: Country,
        val selectedItemIndex: Int = 0,
        val weatherSelectedCountry: Weather
    ) : ListScreenState
}

data class WeatherUiState(
//    val imageUrl:String =
    val date: String = "Friday, April 15",
    val weatherDescription: String = "Sunny 32°C",
)

