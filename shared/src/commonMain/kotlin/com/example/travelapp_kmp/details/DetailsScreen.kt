package com.example.travelapp_kmp.details

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
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
import kotlin.random.Random


@OptIn(ExperimentalUnitApi::class, ExperimentalResourceApi::class)
@Composable
internal fun DetailScreen(navigationState: MutableState<ScreensState>, touristPlace: TouristPlace) {
    Box {
        val backgroundImage = remember { mutableStateOf(touristPlace.images.first()) }
        Image(
            painter = painterResource(backgroundImage.value),
            null,
            modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi).blur(32.dp),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
                setToScale(
                    0.9f, 0.9f, 0.9f, 1f
                )
            }),
        )

        Box(modifier = Modifier.fillMaxSize().background(TravelAppColors.DarkGraySemi))

        Column(
            modifier = Modifier.widthIn(max = 500.dp).padding(top = 64.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "back arrow",
                modifier = Modifier.padding(start = 16.dp).widthIn(max = 500.dp)
                    .clickable(onClick = {
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
                        contentDescription = null,
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

@OptIn(ExperimentalMaterialApi::class, ExperimentalResourceApi::class)
@Composable
internal fun ImageGallery(
    imagesList: List<DrawableResource>, onDetailsClicked: (DrawableResource) -> Unit
) {
    LazyRow(
        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items = imagesList, key = { Random.nextInt() }) { imageUrl ->
            Card(
                elevation = 16.dp,
                modifier = Modifier.height(210.dp).aspectRatio(ratio = (139.0 / 210.0).toFloat())
                    .clip(RoundedCornerShape(16.dp)),
                contentColor = Color.Transparent,
            ) {
                Box {
                    Image(
                        painter = painterResource(imageUrl),
                        contentDescription = null,
                        modifier = Modifier.height(210.dp)
                            .aspectRatio(ratio = (139.0 / 210.0).toFloat())
                            .background(TravelAppColors.SemiWhite)
                            .clickable(onClick = { onDetailsClicked(imageUrl) }),
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }
    }
}



