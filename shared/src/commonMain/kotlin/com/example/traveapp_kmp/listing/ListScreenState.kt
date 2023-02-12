package com.example.traveapp_kmp.listing


sealed interface ListScreenState {
    object Loading : ListScreenState
    data class Error(val message: String) : ListScreenState
    data class Success(
        val countriesList: List<Country>,
        val selectedCountry: Country,
        val scrollToStart: Boolean = false,
        val selectedItemIndex: Int = 0,
        val currentTouristPlace: TouristPlace
    ) : ListScreenState
}
