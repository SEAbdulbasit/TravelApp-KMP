package com.example.travelapp_kmp.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.travelapp_kmp.listing.TouristPlace
import com.example.travelapp_kmp.screennavigation.Screen
import com.example.travelapp_kmp.screennavigation.ScreensState
import com.example.travelapp_kmp.style.TravelAppColors
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import kotlin.random.Random


@OptIn(ExperimentalResourceApi::class)
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
                onImageLongClick = {
                    popup = it
                })
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
    imagesList: List<DrawableResource>,
    onDetailsClicked: (DrawableResource) -> Unit,
    onImageLongClick: (DrawableResource) -> Unit
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
                            .pointerInput(Unit) {
                                detectTapGestures(
                                    onLongPress = {
                                        // Notify client regarding the long press event.
                                        onImageLongClick(imageUrl)
                                    },
                                    onTap = {
                                        // Notify client regarding the single click event.
                                        onDetailsClicked(imageUrl)
                                    }
                                )
                            },
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }
    }
}

/**
 * Show a image pop using an Dialog instance..
 *
 * @param imageResId [DrawableResource] to be shown.
 * @param onDismiss Notify client about dismiss event.
 */
@OptIn(ExperimentalMaterialApi::class, ExperimentalResourceApi::class)
@Composable
internal fun ShowImagePopup(
    imageResId: DrawableResource,
    onDismiss: () -> Unit = {}
) {
    // Create a state to track whether the dialog is visible or not
    var showDialog by remember { mutableStateOf(true) }

    // Use the Dialog composable to create a popup
    if (showDialog) {
        Dialog(
            onDismissRequest = {
                /*
                Set the state to false to dismiss the dialog,
                and notify client about the dismiss status.
                 */
                showDialog = false
                onDismiss.invoke()
            }
        ) {
            // Create a composable for the dialog content
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .background(MaterialTheme.colors.background)
                    .aspectRatio(ratio = 1F),
                contentAlignment = Alignment.Center
            ) {
                // Display the image using the Image composable
                Image(
                    painter = painterResource(imageResId),
                    null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}




