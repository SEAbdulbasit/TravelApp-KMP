package com.example.traveapp_kmp.screennavigation

import com.example.traveapp_kmp.listing.TouristPlace

sealed interface Screen {
    object MainScreen : Screen
    data class DetailScreen(val touristPlace: TouristPlace) : Screen
}

data class ScreensState(val screen: Screen = Screen.MainScreen)