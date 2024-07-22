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
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.travelapp_kmp.listing.TouristPlace
import com.example.travelapp_kmp.style.TravelAppColors
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource


@Composable
internal fun DetailScreen(navigateBack: () -> Unit, touristPlace: TouristPlace) {
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
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
                .windowInsetsPadding(WindowInsets.systemBars)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Box(
                    modifier = Modifier.size(56.dp).padding(start = 16.dp),
                    contentAlignment = Alignment.CenterStart,
                ) {
                    Image(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "back arrow",
                        modifier = Modifier.clickable { navigateBack() },
                        colorFilter = ColorFilter.tint(color = Color.White),
                    )
                }
                Text(
                    text = touristPlace.name,
                    maxLines = 1,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Medium, color = Color.White
                    ),
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            Card(
                elevation = CardDefaults.elevatedCardElevation(),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                    .aspectRatio(ratio = 335f / 280f).clip(RoundedCornerShape(15.dp)),
            ) {
                Image(
                    painter = painterResource(backgroundImage.value),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                text = touristPlace.name, style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Medium, color = Color.White
                ), modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            Text(
                text = touristPlace.longDescription,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = TextUnit(0.1f, TextUnitType.Em),
                    lineHeight = TextUnit(22f, TextUnitType.Sp)
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 10.dp)
            )
            Text(
                text = "Photos", style = MaterialTheme.typography.bodySmall.copy(
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
            ImageGallery(imagesList = touristPlace.images,
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
            style = MaterialTheme.typography.bodySmall.copy(Color.White),
            fontWeight = FontWeight.Medium,
        )
        Text(
            text = "2,500 rvs",
            modifier = Modifier.weight(1f, false).padding(top = 5.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.bodySmall.copy(color = Color.White),
        )
    }
}

@OptIn(
    ExperimentalMaterial3Api::class
)
@Composable
internal fun ImageGallery(
    imagesList: List<DrawableResource>,
    onDetailsClicked: (DrawableResource) -> Unit,
    onImageLongClick: (DrawableResource) -> Unit
) {

    HorizontalMultiBrowseCarousel(
        state = rememberCarouselState { imagesList.size },
        modifier = Modifier.fillMaxWidth().height(221.dp).padding(16.dp),
        preferredItemWidth = 186.dp,
        itemSpacing = 8.dp,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) { i ->
        val item = imagesList[i]
        Image(
            painter = painterResource(item),
            contentDescription = null,
            modifier = Modifier.height(210.dp).maskClip(MaterialTheme.shapes.extraLarge)
                .pointerInput(Unit) {
                    detectTapGestures(onLongPress = {
                        // Notify client regarding the long press event.
                        onImageLongClick(item)
                    }, onTap = {
                        // Notify client regarding the single click event.
                        onDetailsClicked(item)
                    })
                },
            contentScale = ContentScale.Crop,
        )
    }
}

/**
 * Show a image pop using an Dialog instance..
 *
 * @param imageResId [DrawableResource] to be shown.
 * @param onDismiss Notify client about dismiss event.
 */
@Composable
internal fun ShowImagePopup(
    imageResId: DrawableResource, onDismiss: () -> Unit = {}
) {
    // Create a state to track whether the dialog is visible or not
    var showDialog by remember { mutableStateOf(true) }

    // Use the Dialog composable to create a popup
    if (showDialog) {
        Dialog(onDismissRequest = {
            /*
           Set the state to false to dismiss the dialog,
           and notify client about the dismiss status.
           */
            showDialog = false
            onDismiss.invoke()
        }) {

            Card(
                modifier = Modifier.padding(16.dp).background(Transparent)
                    .aspectRatio(ratio = 4 / 3F), shape = RoundedCornerShape(10.dp)
            ) {
                // Display the image using the Image composable
                Image(
                    painter = painterResource(imageResId),
                    null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}




