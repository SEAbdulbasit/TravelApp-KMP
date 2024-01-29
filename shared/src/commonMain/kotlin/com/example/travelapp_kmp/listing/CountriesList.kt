package com.example.travelapp_kmp.listing

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class Country(
    val name: String,
    val touristPlaces: List<TouristPlace>
)

data class TouristPlace @OptIn(ExperimentalResourceApi::class) constructor(
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val images: List<DrawableResource>
)