package com.example.travelapp_kmp.network


import com.example.travelapp_kmp.listing.Weather
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    @SerialName("weather")
    val weather: List<WeatherDto?>?,
    @SerialName("dt")
    val dt: Int?,
)

@Serializable
data class WeatherDto(
    @SerialName("id")
    val id: Int?,
    @SerialName("main")
    val main: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("icon")
    val icon: String?
)

fun WeatherResponse.toWeather() = Weather(
    date = dt.toString(),
    weatherDescription = weather?.first()?.description ?: ""
)
