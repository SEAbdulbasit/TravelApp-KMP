package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.listing.Country

class CountriesApiImpl : CountriesApi {
    override suspend fun getCountriesList(): List<Country> {
        return getRestCountriesList()
    }
//
//    private val client = HttpClient {
//        expectSuccess = true
//        install(HttpTimeout) {
//            val timeout = 30000L
//            connectTimeoutMillis = timeout
//            requestTimeoutMillis = timeout
//            socketTimeoutMillis = timeout
//        }
//        install(ContentNegotiation) {
//            json()
//        }
//    }
//
//    private fun HttpRequestBuilder.countries(path: String) {
//        url {
//            takeFrom("http://192.168.10.3:3000/")
//            encodedPath = path
//        }
//    }
}