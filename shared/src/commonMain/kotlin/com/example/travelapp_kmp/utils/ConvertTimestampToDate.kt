package com.example.travelapp_kmp.utils

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern
import kotlinx.datetime.toLocalDateTime

@OptIn(FormatStringsInDatetimeFormats::class)
fun convertTimestampToDate(timestamp: Int): String {
    val instant = Instant.fromEpochSeconds(timestamp.toLong())
    val localDateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())

    val dayOfWeek = localDateTime.dayOfWeek.name.lowercase().replaceFirstChar { it.uppercase() }
    val month = localDateTime.month.name.lowercase().replaceFirstChar { it.uppercase() }
    val dayOfMonth = localDateTime.dayOfMonth
    val time = localDateTime.format(LocalDateTime.Format { byUnicodePattern("HH:mm") })

    return "$dayOfWeek $dayOfMonth $month $time"
}
