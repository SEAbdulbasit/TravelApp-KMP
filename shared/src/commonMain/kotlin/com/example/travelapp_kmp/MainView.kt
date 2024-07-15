package com.example.travelapp_kmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.travelapp_kmp.details.DetailScreen
import com.example.travelapp_kmp.details.DetailScreenWeb
import com.example.travelapp_kmp.listing.ListScreenViewModel
import com.example.travelapp_kmp.listing.MainScreen
import com.example.travelapp_kmp.screennavigation.Screen
import com.example.travelapp_kmp.screennavigation.ScreensState


@Composable
internal fun CommonView(isLargeScreen: Boolean = false) {
    val viewMode = ListScreenViewModel()
    val screenNavigationState = remember { mutableStateOf(ScreensState()) }

    MaterialTheme {
        when (val state = screenNavigationState.value.screen) {
            is Screen.DetailScreen -> if (isLargeScreen) {
                DetailScreenWeb(
                    navigationState = screenNavigationState,
                    touristPlace = state.touristPlace
                )
            } else {
                DetailScreen(
                    navigationState = screenNavigationState,
                    touristPlace = state.touristPlace
                )
            }

            Screen.MainScreen -> MainScreen(screenNavigationState, viewMode)
        }
    }
}

