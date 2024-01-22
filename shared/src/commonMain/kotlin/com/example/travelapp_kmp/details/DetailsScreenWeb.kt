package com.example.travelapp_kmp.details

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.travelapp_kmp.listing.TouristPlace
import com.example.travelapp_kmp.screennavigation.Screen
import com.example.travelapp_kmp.screennavigation.ScreensState
import com.example.travelapp_kmp.style.TravelAppColors
import com.example.travelapp_kmp.toImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.resource


@OptIn(ExperimentalUnitApi::class, ExperimentalResourceApi::class)
@Composable
internal fun DetailScreenWeb(navigationState: MutableState<ScreensState>, touristPlace: TouristPlace) {
    val scope = rememberCoroutineScope()
    val backgroundImage = remember { mutableStateOf(touristPlace.images.first()) }
    val backgroundImageBitmap = remember { mutableStateOf<ImageBitmap?>(null) }
    Box {

        scope.launch(Dispatchers.Unconfined) {
            backgroundImageBitmap.value = resource(backgroundImage.value).readBytes().toImageBitmap()
        }

        backgroundImageBitmap.value?.let {
            Image(
                it,
                null,
                modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi),
                contentScale = ContentScale.Crop,
            )
        }
        Box(modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi))

        Row {
            Column(
                modifier = Modifier.weight(1f).padding(top = 16.dp).verticalScroll(rememberScrollState())
            ) {
                Image(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = touristPlace.images.first(),
                    modifier = Modifier.padding(start = 16.dp).clickable(onClick = {
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
                        backgroundImageBitmap.value?.let {
                            Image(
                                bitmap = it,
                                contentDescription = touristPlace.images.first(),
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
                ImageGallery(touristPlace.images, scope) { backgroundImage.value = it }
            }

            Column(modifier = Modifier.weight(1f)) {
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
            }
        }
    }
}
