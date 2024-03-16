package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.BuildKonfig
import com.example.travelapp_kmp.listing.Country
import com.example.travelapp_kmp.listing.Location
import com.example.travelapp_kmp.listing.Weather
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class CountriesApiImpl : CountriesApi {
    override suspend fun getCountriesList(): List<Country> {
        return getRestCountriesList()
    }

    override suspend fun getWeather(location: Location): Weather {
        return client.get {
            openWeather(location)
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

    private fun HttpRequestBuilder.openWeather(location: Location) {
        url {
            takeFrom("https://api.openweathermap.org/")
            path("data/2.5/weather")
            parameter(
                "appid", BuildKonfig.WEATHER_API_KEY
            )
            parameter("lat", location.lat)
            parameter("lon", location.long)
            parameter("units", "metric")
        }
    }
}