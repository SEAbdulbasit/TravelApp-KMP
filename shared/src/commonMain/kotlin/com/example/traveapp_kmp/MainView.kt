package com.example.traveapp_kmp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.example.traveapp_kmp.details.DetailScreen
import com.example.traveapp_kmp.details.DetailScreenWeb
import com.example.traveapp_kmp.listing.ListScreenViewModel
import com.example.traveapp_kmp.listing.MainScreen
import com.example.traveapp_kmp.screennavigation.Screen
import com.example.traveapp_kmp.screennavigation.ScreensState
import com.example.traveapp_kmp.style.TravelAppColors


@Composable
internal fun CommonView(width: Float = 200f) {
    val viewMode = ListScreenViewModel()
    val screenNavigationState = remember { mutableStateOf(ScreensState()) }

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
        when (val state = screenNavigationState.value.screen) {
            is Screen.DetailScreen -> DetailScreen(
                navigationState = screenNavigationState,
                touristPlace = state.touristPlace
            )

            Screen.MainScreen -> MainScreen(screenNavigationState, viewMode, width)
        }
    }
}

