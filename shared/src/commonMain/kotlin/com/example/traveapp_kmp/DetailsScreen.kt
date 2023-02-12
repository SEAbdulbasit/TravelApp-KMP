package com.example.traveapp_kmp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.traveapp_kmp.screennavigation.ScreensState
import com.seiko.imageloader.rememberAsyncImagePainter


@OptIn(ExperimentalUnitApi::class)
@Composable
internal fun DetailScreen(state: MutableState<ScreensState>) {
    Box {
        val url = "https://i.postimg.cc/c1vXfhTP/Rectangle-917.png"
        val painter = rememberAsyncImagePainter(url)
        Image(
            painter, null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop,
        )

        Column(
            modifier = Modifier.padding(top = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "New Album",
                modifier = Modifier.padding(start = 16.dp),
            )
            val painter = rememberAsyncImagePainter("https://i.postimg.cc/JnfnWbTn/Frame-53.png")
            Card(
                elevation = 16.dp,
                modifier = Modifier.aspectRatio(ratio = 335f / 280f).clip(RoundedCornerShape(15.dp))
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp),
                contentColor = Color.Transparent,
                backgroundColor = Color.Transparent
            ) {
                Image(
                    painter,
                    "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                )
            }
            PlaceInfo()
            Text(
                text = "Mount Fuji, Japan", style = MaterialTheme.typography.h5.copy(
                    fontWeight = FontWeight.Medium, color = Color.White
                ), modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
            Text(
                text = "Japan’s Mt. Fuji is an active volcano about 100 kilometers southwest of Tokyo." + " Commonly called “Fuji-san,” it’s the country’s tallest peak, at 3,776 meters. A pilgrimage site for centu" + "ries, it’s considered one of Japan’s 3 sacred mountains, and summit hikes remain a popular activity. Its iconic" + " profile is the subject of numerous works of art, notably Edo Period prints by Hokusai and Hiroshige.",
                style = MaterialTheme.typography.subtitle2.copy(
                    color = Color.White, fontWeight = FontWeight.Normal,
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
            ImageGallery(listOf(
                "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                "https://i.postimg.cc/JnfnWbTn/Frame-53.png",
                "https://i.postimg.cc/JnfnWbTn/Frame-53.png"
            ), {})
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
internal fun ImageGallery(imagesList: List<String>, onDetailsClicked: (Unit) -> Unit) {
    LazyRow(
        modifier = Modifier.padding(top = 16.dp, bottom = 16.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items = imagesList) { imageUrl ->
            val painter = rememberAsyncImagePainter(imageUrl)
            Card(elevation = 16.dp,
                modifier = Modifier.height(210.dp).aspectRatio(ratio = (139.0 / 210.0).toFloat())
                    .clip(RoundedCornerShape(20.dp)),
                contentColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                onClick = { onDetailsClicked(Unit) }) {
                Image(
                    painter = painter,
                    contentDescription = imageUrl,
                    modifier = Modifier.aspectRatio(ratio = (139.0 / 210.0).toFloat())
                )
            }
        }
    }
}



