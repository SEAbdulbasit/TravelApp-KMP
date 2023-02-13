package com.example.traveapp_kmp.network

import com.example.traveapp_kmp.listing.Country

interface CountriesApi {
    suspend fun getCountriesList(): List<Country>
}