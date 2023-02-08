package com.example.traveapp_kmp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.traveapp_kmp.style.TravelAppColors
import com.seiko.imageloader.rememberAsyncImagePainter
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.jetbrains.compose.resources.resource

@Composable
internal fun MainScreen() {
    Box {
        val url =
            "https://i.postimg.cc/c1vXfhTP/Rectangle-917.png"
        val painter = rememberAsyncImagePainter(url)
        Image(
            painter, null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop,
        )

        Column {
            WeatherView()
            ListCountryChips(listOf("Japan", "South Koria", "Italy", "Vietnam"))
            Content()
        }
    }
}


@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun WeatherView() {
    Row(Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp)) {
        Image(
            resource("partly_cloudy.png").rememberImageBitmap().orEmpty(),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Column(Modifier.padding(start = 8.dp)) {
            Text("Friday, April 15", style = MaterialTheme.typography.body1)
            Text("Sunny 32°C", style = MaterialTheme.typography.h6)
        }
    }
}

@Composable
private fun ListCountryChips(list: List<String>) {
    var state by remember { mutableStateOf(list.first()) }
    LazyRow(contentPadding = PaddingValues(8.dp)) {
        items(items = list) { name ->
            CountryChips(name, state == name) { state = it }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun CountryChips(name: String, isSelected: Boolean, onItemSelected: (String) -> Unit) {
    Surface(modifier = Modifier.background(Color.Transparent),
        shape = RoundedCornerShape(20.dp),
        border = if (isSelected) BorderStroke(
            width = 1.dp, color = Color.White
        ) else BorderStroke(
            width = 0.dp, color = Color.Transparent,
        ),
        color = if (isSelected) TravelAppColors.SemiWhite else Color.Transparent,
        onClick = { onItemSelected(name) }) {
        Text(
            name,
            style = MaterialTheme.typography.body1.copy(color = Color.Black),
            modifier = Modifier.padding(
                start = 24.dp, top = 8.dp, bottom = 8.dp, end = 24.dp
            ).background(Color.Transparent),
        )
    }
}

@Composable
internal fun Content() {
    val url =
        "https://fastly.picsum.photos/id/993/200/300.jpg?hmac=wwmtancuL0E4SpM9dBnkL-0sXQCflrwn9mJZgo0GNKo"
    val painter = rememberAsyncImagePainter(url)
    Image(painter, null)
}


data class State(val selectedCountry: String)
