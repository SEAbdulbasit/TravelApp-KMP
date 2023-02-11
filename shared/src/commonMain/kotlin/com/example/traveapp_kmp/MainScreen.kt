package com.example.traveapp_kmp

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.traveapp_kmp.screennavigation.Screen
import com.example.traveapp_kmp.screennavigation.ScreensState
import com.example.traveapp_kmp.style.TravelAppColors
import com.seiko.imageloader.rememberAsyncImagePainter

@Composable
internal fun MainScreen(state: MutableState<ScreensState>) {
    MainScreenView(onDetailsClicked = {
        state.value = state.value.copy(screen = Screen.DetailScreen)
    })
}

@Composable
internal fun MainScreenView(onDetailsClicked: (Unit) -> Unit) {
    Box {
        val url = "https://i.postimg.cc/c1vXfhTP/Rectangle-917.png"
        val painter = rememberAsyncImagePainter(url)
        Image(
            painter, null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop,
        )

        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.align(Alignment.Start)) {
                Column {
                    WeatherView()
                    ListCountryChips(listOf("Japan", "South Koria", "Italy", "Vietnam"))
                }
            }
            Box(modifier = Modifier.weight(1f, false)) {
                ImageSlider(
                    listOf(
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                        "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                    ),
                    onDetailsClicked
                )
            }
            Box(modifier = Modifier.align(Alignment.End).padding(bottom = 16.dp).fillMaxWidth()) {
                Column {
                    Counter()
                    Line()
                    VisitingPlacesList(listOf("Japan", "South Koria", "Italy", "Vietnam"))
                }
            }
        }
    }
}


@Composable
internal fun WeatherView() {
    Row(
        Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, top = 56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val url = "https://i.postimg.cc/c1vXfhTP/Rectangle-917.png"
        val painter = rememberAsyncImagePainter(url)
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.size(48.dp).clip(RoundedCornerShape(16.dp))
        )
        Column(Modifier.padding(start = 8.dp)) {
            Text(
                "Friday, April 15", style = MaterialTheme.typography.caption.copy(
                    color = Color.White, fontWeight = FontWeight.Normal
                )
            )
            Text(
                "Sunny 32°C", style = MaterialTheme.typography.body2.copy(
                    color = Color.White, fontWeight = FontWeight.Bold
                )
            )
        }

    }
}

@Composable
private fun ListCountryChips(list: List<String>) {
    var state by remember { mutableStateOf(list.first()) }
    LazyRow(contentPadding = PaddingValues(8.dp), modifier = Modifier.padding(top = 16.dp)) {
        items(items = list) { name ->
            CountryChips(name, state == name) { state = it }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun CountryChips(name: String, isSelected: Boolean, onItemSelected: (String) -> Unit) {
    Surface(modifier = Modifier.background(Color.Transparent).height(36.dp),
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
            modifier = Modifier.padding(start = 24.dp, top = 8.dp, bottom = 8.dp, end = 24.dp)
                .background(Color.Transparent),
        )
    }
}

@OptIn(ExperimentalUnitApi::class, ExperimentalMaterialApi::class)
@Composable
internal fun ImageSlider(imagesList: List<String>, onDetailsClicked: (Unit) -> Unit) {
    LazyRow(
        modifier = Modifier.padding(top = 8.dp).fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items = imagesList) { imageUrl ->
            val painter = rememberAsyncImagePainter(imageUrl)
            Card(
                elevation = 16.dp,
                modifier = Modifier
                    .aspectRatio(ratio = (295.0 / 432.0).toFloat())
                    .clip(RoundedCornerShape(20.dp)),
                contentColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                onClick = { onDetailsClicked(Unit) }
            ) {
                Box {
                    Image(
                        painter,
                        imageUrl,
                        modifier = Modifier
                            .aspectRatio(ratio = (295.0 / 432.0).toFloat()),
                    )
                    Column(
                        modifier = Modifier.padding(16.dp).align(Alignment.BottomCenter)
                    ) {
                        Text(
                            text = "Tokyo", style = MaterialTheme.typography.h4.copy(
                                color = Color.White, fontWeight = FontWeight.Medium
                            )
                        )
                        Text(
                            text = "Tokyo, Japan’s busy capital, mixes the ultramodern and the traditional, from neon-lit skyscrapers to historic temples. The opulent Meiji Shinto Shrine is known for its towering gate and surrounding woods.",
                            style = MaterialTheme.typography.caption.copy(
                                color = Color.White,
                                letterSpacing = TextUnit(0.1f, TextUnitType.Em),
                                lineHeight = TextUnit(19f, TextUnitType.Sp)
                            ),
                            modifier = Modifier.padding(top = 16.dp),
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                        Row(Modifier.padding(top = 20.dp)) {
                            Text(
                                text = "Discover Place",
                                style = MaterialTheme.typography.subtitle2.copy(
                                    textDecoration = TextDecoration.Underline,
                                    color = Color.White,
                                    fontWeight = FontWeight.SemiBold
                                ),
                            )
                            Icon(
                                imageVector = Icons.Filled.ArrowForward,
                                tint = Color.White,
                                contentDescription = "New Album",
                                modifier = Modifier.size(24.dp).padding(start = 8.dp)
                                    .align(Alignment.Top)
                            )
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
internal fun Counter() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(top = 30.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                "01", style = MaterialTheme.typography.subtitle2.copy(
                    color = Color.White, fontSize = TextUnit(
                        24f, TextUnitType.Sp
                    )
                ), modifier = Modifier.align(Alignment.Bottom).padding(0.dp)
            )
            Text(
                "/01",
                style = MaterialTheme.typography.subtitle2.copy(color = Color.White),
                modifier = Modifier.align(Alignment.Bottom)
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "New Album",
                tint = Color.White
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "New Album",
                tint = Color.White
            )
        }
    }
}

@Composable
internal fun Line() {
    Divider(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp).fillMaxWidth()
            .background(TravelAppColors.SemiWhite)

    )
}

@Composable
internal fun VisitingPlacesList(list: List<String>) {
    val isSelected = true
    LazyRow(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        items(list) {
            Text(
                it,
                style = MaterialTheme.typography.body1.copy(
                    color = if (isSelected) Color.White else Color.White.copy(
                        alpha = 0.7f
                    ), fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 8.dp)
                    .background(Color.Transparent),
            )
        }
    }
}
