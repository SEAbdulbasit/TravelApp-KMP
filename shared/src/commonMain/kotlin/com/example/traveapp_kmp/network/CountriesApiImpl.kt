package com.example.traveapp_kmp.network

import com.example.traveapp_kmp.listing.Country
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

class CountriesApiImpl : CountriesApi {
    override suspend fun getCountriesList(): List<Country> {
        return client.get {
            countries("countrieslist")
        }.body()
    }

    private val client = HttpClient {
        expectSuccess = true
        install(HttpTimeout) {
            val timeout = 30000L
            connectTimeoutMillis = timeout
            requestTimeoutMillis = timeout
            socketTimeoutMillis = timeout
        }
        install(ContentNegotiation) {
            json()
        }
    }

    private fun HttpRequestBuilder.countries(path: String) {
        url {
            takeFrom("http://192.168.10.3:3000/")
            encodedPath = path
        }
    }
}