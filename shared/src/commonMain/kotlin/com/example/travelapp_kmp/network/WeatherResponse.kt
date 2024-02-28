package com.example.travelapp_kmp.network


import com.example.travelapp_kmp.listing.Weather
import com.example.travelapp_kmp.utils.convertTimestampToDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    @SerialName("weather")
    val weather: List<WeatherDto?>?,
    @SerialName("dt")
    val timestamp: Int?,
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
    imageUrl = weather?.first()?.icon?.let { "https://openweathermap.org/img/wn/$it@2x.png" } ?: "",
    date = timestamp?.let { convertTimestampToDate(it) } ?: "",
    weatherDescription = weather?.first()?.description ?: ""
)
