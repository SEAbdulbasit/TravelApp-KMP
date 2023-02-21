package com.example.traveapp_kmp.details

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import com.example.traveapp_kmp.listing.TouristPlace
import com.example.traveapp_kmp.screennavigation.Screen
import com.example.traveapp_kmp.screennavigation.ScreensState
import com.example.traveapp_kmp.style.TravelAppColors
import com.seiko.imageloader.rememberAsyncImagePainter


@OptIn(ExperimentalUnitApi::class)
@Composable
internal fun DetailScreen(navigationState: MutableState<ScreensState>, touristPlace: TouristPlace) {
    Box {
        val backgroundImage = remember { mutableStateOf(touristPlace.images.first()) }
        val painter = rememberAsyncImagePainter(backgroundImage.value)

        Image(
            painter,
            null,
            modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi),
            contentScale = ContentScale.FillBounds,
        )
        Box(modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi))

        Column(
            modifier = Modifier.widthIn(max = 500.dp).padding(top = 16.dp).verticalScroll(rememberScrollState())
        ) {
            Image(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = touristPlace.images.first(),
                modifier = Modifier.padding(start = 16.dp).widthIn(max = 500.dp).clickable(onClick = {
                    navigationState.value = ScreensState(
                        Screen.MainScreen
                    )
                }),
                colorFilter = ColorFilter.tint(color = Color.White),
            )
            Card(
                elevation = 16.dp,
                modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
                    .aspectRatio(ratio = 335f / 280f).clip(RoundedCornerShape(15.dp)),
                contentColor = Color.Transparent,
            ) {
                Box {
                    Image(
                        painter = painter,
                        contentDescription = touristPlace.images.first(),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            PlaceInfo()
            Text(
                text = touristPlace.name, style = MaterialTheme.typography.h5.copy(
                    fontWeight = FontWeight.Medium, color = Color.White
                ), modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            Text(
                text = touristPlace.longDescription,
                style = MaterialTheme.typography.subtitle2.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = TextUnit(0.1f, TextUnitType.Em),
                    lineHeight = TextUnit(22f, TextUnitType.Sp)
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 10.dp)
            )
            Text(
                text = "Photos", style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.Medium, color = Color.White
                ), modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            ImageGallery(touristPlace.images) { backgroundImage.value = it }
        }
    }
}

@Composable
internal fun PlaceInfo() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 16.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        IconWithText()
        IconWithText()
        IconWithText()
    }
}

@Composable
internal fun IconWithText() {
    Column {
        Icon(
            imageVector = Icons.Filled.Star,
            contentDescription = "Start",
            tint = Color.White,
            modifier = Modifier.weight(1f, false).align(Alignment.CenterHorizontally),
        )
        Text(
            text = "4.8",
            modifier = Modifier.weight(1f, false).padding(top = 5.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.subtitle1.copy(Color.White),
            fontWeight = FontWeight.Medium,
        )
        Text(
            text = "2,500 rvs",
            modifier = Modifier.weight(1f, false).padding(top = 5.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.caption.copy(color = Color.White),
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun ImageGallery(imagesList: List<String>, onDetailsClicked: (String) -> Unit) {
    LazyRow(
        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items = imagesList) { imageUrl ->
            val painter = rememberAsyncImagePainter(imageUrl)
            Card(
                elevation = 16.dp,
                modifier = Modifier.height(210.dp).aspectRatio(ratio = (139.0 / 210.0).toFloat())
                    .clip(RoundedCornerShape(16.dp)),
                contentColor = Color.Transparent,
            ) {
                Box {
                    Image(
                        painter = painter,
                        contentDescription = imageUrl,
                        modifier = Modifier.height(210.dp)
                            .aspectRatio(ratio = (139.0 / 210.0).toFloat())
                            .background(TravelAppColors.SemiWhite).clickable(
                                onClick = { onDetailsClicked(imageUrl) }
                            ),
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }
    }
}



