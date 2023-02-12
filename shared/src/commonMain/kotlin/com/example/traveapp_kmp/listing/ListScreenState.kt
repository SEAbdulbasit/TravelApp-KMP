package com.example.traveapp_kmp.listing


sealed interface ListScreenState {
    object Loading : ListScreenState
    data class Error(val message: String) : ListScreenState
    data class Success(val data: ListScreenSuccessState) : ListScreenState
}

data class ListScreenSuccessState(
    val countriesList: List<Country>,
    val selectedCountry: Country
)