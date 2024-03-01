package com.example.travelapp_kmp.listing

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class Country @OptIn(ExperimentalResourceApi::class) constructor(
    val name: String,
    val flagIcon: DrawableResource? = null,
    val touristPlaces: List<TouristPlace>
)

data class TouristPlace @OptIn(ExperimentalResourceApi::class) constructor(
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val location: Location,
    val images: List<DrawableResource>
)

data class Location(
    val lat: Double,
    val long: Double,
)

data class Weather(
    val imageUrl: String,
    val date: String,
    val weatherDescription: String,
)