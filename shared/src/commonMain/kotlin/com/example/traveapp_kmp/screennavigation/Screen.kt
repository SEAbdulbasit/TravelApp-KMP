package com.example.traveapp_kmp.screennavigation

sealed interface Screen {
    object MainScreen : Screen
    object DetailScreen : Screen
}

data class ScreensState(val screen: Screen = Screen.MainScreen)