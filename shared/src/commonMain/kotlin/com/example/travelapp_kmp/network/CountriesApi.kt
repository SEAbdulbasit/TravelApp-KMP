package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.listing.Country
import com.example.travelapp_kmp.listing.Weather

interface CountriesApi {
    suspend fun getCountriesList(): List<Country>
    suspend fun getWeather(county: String): Weather
}