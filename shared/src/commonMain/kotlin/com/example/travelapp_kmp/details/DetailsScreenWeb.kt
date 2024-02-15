package com.example.travelapp_kmp.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

//import org.jetbrains.compose.resources.resource


@OptIn(ExperimentalUnitApi::class, ExperimentalResourceApi::class)
@Composable
internal fun DetailScreenWeb(
    navigationState: MutableState<ScreensState>,
    touristPlace: TouristPlace
) {
    val backgroundImage = remember { mutableStateOf(touristPlace.images.first()) }
    Box {
        Image(
            painter = painterResource(resource = backgroundImage.value),
            contentDescription = null,
            modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi),
            contentScale = ContentScale.Crop,
        )

        Box(modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi))

        Row {
            Column(
                modifier = Modifier.weight(1f).padding(top = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back arrow",
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
                        Image(
                            painter = painterResource(backgroundImage.value),
                            null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop,
                        )
                    }

                }
                // Store the drawable resource in a state.
                var popup: DrawableResource? by remember {
                    mutableStateOf(null)
                }
                // If resource state is not null, show the popup.
                popup?.let {
                    ShowImagePopup(it) {
                        // On dismiss, clear the stored drawable resource state.
                        popup = null
                    }
                }
                ImageGallery(
                    imagesList = touristPlace.images,
                    onDetailsClicked = { backgroundImage.value = it },
                    onImageLongClick = { popup = it })
            }

            Column(
                modifier = Modifier.weight(1f).verticalScroll(rememberScrollState())
            ) {
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
            }
        }
    }
}
