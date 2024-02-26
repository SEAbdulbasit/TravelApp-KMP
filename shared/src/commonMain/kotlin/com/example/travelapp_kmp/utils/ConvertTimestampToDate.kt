package com.example.travelapp_kmp.utils

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun convertTimestampToDate(timestamp: Int): String {
    val instant = Instant.fromEpochSeconds(timestamp.toLong())
    val localDateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())

    val dayOfWeek = localDateTime.dayOfWeek.name.lowercase().replaceFirstChar { it.uppercase() }
    val month = localDateTime.month.name.lowercase().replaceFirstChar { it.uppercase() }
    val dayOfMonth = localDateTime.dayOfMonth

    return "$dayOfWeek, $month $dayOfMonth"
}
