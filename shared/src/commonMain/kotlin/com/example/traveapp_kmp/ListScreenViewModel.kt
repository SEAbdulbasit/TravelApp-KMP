package com.example.traveapp_kmp

import com.example.traveapp_kmp.listing.Country
import com.example.traveapp_kmp.listing.ListScreenState
import com.example.traveapp_kmp.listing.ListScreenSuccessState
import com.example.traveapp_kmp.listing.TouristPlace
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class ListScreenViewModel {
    private val viewModelScope = CoroutineScope(Dispatchers.Main)
    val state = MutableStateFlow<ListScreenState>(ListScreenState.Loading)

    init {
        viewModelScope.launch(Dispatchers.Main) {
            state.emit(
                ListScreenState.Success(
                    data = ListScreenSuccessState(
                        countriesList = getDefaultCountryList(),
                        selectedCountry = getDefaultCountryList().first()
                    )
                )
            )
        }
    }

    fun onAction(actions: ListViewModelActions) {
        when (actions) {
            is ListViewModelActions.OnCountrySelected -> {
                viewModelScope.launch {
                    emitNewState(actions)
                }
            }
        }
    }

    private suspend fun emitNewState(actions: ListViewModelActions.OnCountrySelected) {
        getStateValueWithEmptyState(state.value)?.run {
            val latestState =
                this.copy(selectedCountry = this.countriesList.first { it.name == actions.country })
            state.emit(ListScreenState.Success(latestState))
        }
    }

    private fun getStateValueWithEmptyState(state: ListScreenState): ListScreenSuccessState? {
        return when (state) {
            is ListScreenState.Error -> null
            ListScreenState.Loading -> null
            is ListScreenState.Success -> state.data
        }
    }
}


sealed interface ListViewModelActions {
    data class OnCountrySelected(val country: String) : ListViewModelActions
}

fun getDefaultCountryList(): List<Country> {
    return listOf(
        Country(
            name = "Japan", touristPlaces = listOf(
                TouristPlace(
                    name = "Tokyo",
                    shortDescription = "This is tokyo",
                    longDescription = "Shsfdsfjsdflk",
                    images = listOf(
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png"
                    )
                ), TouristPlace(
                    name = "Tokyo 1",
                    shortDescription = "This is tokyo 1",
                    longDescription = "Shsfdsfjsdklfjdflkjdsljfdslkfsdflk",
                    images = listOf(
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png"
                    )
                )
            )
        ), Country(
            name = "South Korea", touristPlaces = listOf(
                TouristPlace(
                    name = "Korea 1",
                    shortDescription = "This is tokyo",
                    longDescription = "Shsfdsfjsdflk",
                    images = listOf(
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png"
                    )
                ), TouristPlace(
                    name = "Korea 2",
                    shortDescription = "This is tokyo 1",
                    longDescription = "Shsfdsfjsdklfjdflkjdsljfdslkfsdflk",
                    images = listOf(
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png"
                    )
                )
            )
        )
    )
}