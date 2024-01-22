package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.listing.Country

interface CountriesApi {
    suspend fun getCountriesList(): List<Country>
}