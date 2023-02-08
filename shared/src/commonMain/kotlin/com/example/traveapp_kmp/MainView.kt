package com.example.traveapp_kmp

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.traveapp_kmp.style.TravelAppColors


@Composable
internal fun CommonView() {
    isSystemInDarkTheme() // todo check and change colors
    MaterialTheme(
        colors = MaterialTheme.colors.copy(
            primary = TravelAppColors.Foreground,
            secondary = TravelAppColors.LightGray,
            background = TravelAppColors.DarkGray,
            surface = TravelAppColors.Gray,
            onPrimary = TravelAppColors.Foreground,
            onSecondary = Color.Black,
            onBackground = TravelAppColors.Foreground,
            onSurface = TravelAppColors.Foreground
        )
    ) {
        MainScreen()
    }
}
