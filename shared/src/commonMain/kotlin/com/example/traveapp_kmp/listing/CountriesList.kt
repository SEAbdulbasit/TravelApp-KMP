package com.example.traveapp_kmp.listing

data class Country(
    val name: String,
    val touristPlaces: List<TouristPlace>
)

data class TouristPlace(
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val images: List<String>
)
