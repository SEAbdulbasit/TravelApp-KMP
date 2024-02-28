package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.listing.Country
import com.example.travelapp_kmp.listing.Weather
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.path
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class CountriesApiImpl : CountriesApi {
    override suspend fun getCountriesList(): List<Country> {
        return getRestCountriesList()
    }

    override suspend fun getWeather(county: String): Weather {
        return client.get {
            openWeather(county)
        }.body<WeatherResponse>().toWeather()
    }


    private val client = HttpClient {
        expectSuccess = true
        install(HttpTimeout) {
            val timeout = 30000L
            connectTimeoutMillis = timeout
            requestTimeoutMillis = timeout
            socketTimeoutMillis = timeout
        }
        install(DefaultRequest) {
            header(HttpHeaders.Accept, ContentType.Application.Json)
            header(HttpHeaders.ContentType, ContentType.Application.Json)
        }
        install(ContentNegotiation) {
            json(Json { isLenient = true; ignoreUnknownKeys = true })
        }
    }

    private fun HttpRequestBuilder.openWeather(country: String) {
        url {
            takeFrom("https://api.openweathermap.org/")
            path("data/2.5/weather")
            parameter("appid", "")
            parameter("q", country)
            parameter("units", "metric")
        }
    }
}