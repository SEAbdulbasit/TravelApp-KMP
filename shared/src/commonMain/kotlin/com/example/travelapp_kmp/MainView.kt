package com.example.travelapp_kmp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelapp_kmp.details.DetailScreen
import com.example.travelapp_kmp.details.DetailScreenWeb
import com.example.travelapp_kmp.listing.ListScreenViewModel
import com.example.travelapp_kmp.listing.MainScreen
import com.example.travelapp_kmp.listing.TouristPlace


@Composable
internal fun CommonView(isLargeScreen: Boolean = false) {
    val viewMode = remember { ListScreenViewModel() }
    val navController = rememberNavController()
    var selectedTouristPlace: TouristPlace? = null

    MaterialTheme {

        NavHost(
            navController = navController,
            startDestination = AppScreen.List.name,
            modifier = Modifier.fillMaxSize()
        ) {
            composable(AppScreen.List.name) {
                MainScreen(navigateToDetails = {
                    selectedTouristPlace = it
                    navController.navigate(AppScreen.Details.name)
                }, viewMode = viewMode)
            }
            composable(AppScreen.Details.name) {
                if (isLargeScreen)
                    DetailScreenWeb(touristPlace = selectedTouristPlace!!,
                        navigateBack = { navController.popBackStack() })
                else
                    DetailScreen(touristPlace = selectedTouristPlace!!,
                        navigateBack = { navController.popBackStack() })
            }
        }
    }
}

enum class AppScreen(title: String) {
    List(title = "ListScreen"), Details(title = "DetailsScreen"),
}

