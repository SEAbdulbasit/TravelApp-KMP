package com.example.travelapp_kmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.travelapp_kmp.details.DetailScreen
import com.example.travelapp_kmp.details.DetailScreenWeb
import com.example.travelapp_kmp.listing.ListScreenViewModel
import com.example.travelapp_kmp.listing.MainScreen
import com.example.travelapp_kmp.listing.TouristPlace


@Composable
internal fun CommonView(isLargeScreen: Boolean = false) {
    val viewMode = remember { ListScreenViewModel() }
//    val navController = rememberNavController()
    var selectedTouristPlace: TouristPlace? = null
    val currentScreen = remember { mutableStateOf(AppScreen.List) }

    MaterialTheme {
        when (currentScreen.value) {
            AppScreen.List -> {
                MainScreen(navigateToDetails = {
                    selectedTouristPlace = it
                    currentScreen.value = AppScreen.Details
//                    navController.navigate(AppScreen.Details.name)
                }, viewMode = viewMode)
            }

            AppScreen.Details -> {
                if (isLargeScreen)
                    DetailScreenWeb(touristPlace = selectedTouristPlace!!,
                        navigateBack = {
                            currentScreen.value = AppScreen.List
//                            navController.popBackStack()
                        })
                else
                    DetailScreen(touristPlace = selectedTouristPlace!!,
                        navigateBack = {
                            currentScreen.value = AppScreen.List
//                            navController.popBackStack()
                        })
            }
        }

//        NavHost(
//            navController = navController,
//            startDestination = AppScreen.List.name,
//            modifier = Modifier.fillMaxSize()
//        ) {
//            composable(AppScreen.List.name) {
//                MainScreen(navigateToDetails = {
//                    selectedTouristPlace = it
//                    navController.navigate(AppScreen.Details.name)
//                }, viewMode = viewMode)
//            }
//            composable(AppScreen.Details.name) {
//                if (isLargeScreen)
//                    DetailScreenWeb(touristPlace = selectedTouristPlace!!,
//                        navigateBack = { navController.popBackStack() })
//                else
//                    DetailScreen(touristPlace = selectedTouristPlace!!,
//                        navigateBack = { navController.popBackStack() })
//            }
//        }
    }
}

enum class AppScreen {
    List, Details
}

