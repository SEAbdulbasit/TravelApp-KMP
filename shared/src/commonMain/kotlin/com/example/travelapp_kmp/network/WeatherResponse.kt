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
    @SerialName("main")
    val environment: Environment?
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

@Serializable
data class Environment(
    @SerialName("temp")
    val temp: Double?,
    @SerialName("feels_like")
    val feelsLike: Double?,
    @SerialName("temp_min")
    val tempMin: Double?,
    @SerialName("temp_max")
    val tempMax: Double?,
    @SerialName("pressure")
    val pressure: Int?,
    @SerialName("humidity")
    val humidity: Int?,
)
fun WeatherResponse.toWeather() = Weather(
    imageUrl = weather?.first()?.icon?.let { "https://openweathermap.org/img/wn/$it@2x.png" } ?: "",
    date = timestamp?.let { convertTimestampToDate(it) } ?: "",
    weatherDescription = "${weather?.first()?.description}, ${environment?.temp?.toInt()}°C"
)
