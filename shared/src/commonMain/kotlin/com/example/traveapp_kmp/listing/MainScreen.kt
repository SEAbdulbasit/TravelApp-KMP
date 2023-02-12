package com.example.traveapp_kmp.listing

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
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
import com.example.traveapp_kmp.ListScreenViewModel
import com.example.traveapp_kmp.ListViewModelActions
import com.example.traveapp_kmp.screennavigation.Screen
import com.example.traveapp_kmp.screennavigation.ScreensState
import com.example.traveapp_kmp.style.TravelAppColors
import com.seiko.imageloader.rememberAsyncImagePainter

@Composable
internal fun MainScreen(
    navigationState: MutableState<ScreensState>, viewMode: ListScreenViewModel
) {
    val state = viewMode.state.collectAsState()
    MainScreenView(state = state,
        onDetailsClicked = { navigationState.value = ScreensState(screen = Screen.DetailScreen) },
        resetFlag = { viewMode.onAction(ListViewModelActions.ResetFlag) },
        onCountrySelected = { viewMode.onAction(ListViewModelActions.OnCountrySelected(it)) },
        onItemSwipe = { touristPlace, i ->
            viewMode.onAction(
                ListViewModelActions.OnItemSwiped(
                    touristPlace, i
                )
            )
        })
}

@Composable
internal fun MainScreenView(
    state: State<ListScreenState>,
    onDetailsClicked: (Unit) -> Unit,
    onItemSwipe: (TouristPlace, Int) -> Unit,
    resetFlag: () -> Unit,
    onCountrySelected: (Country) -> Unit
) {
    when (val result = state.value) {
        is ListScreenState.Error -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = result.message)
            }
        }
        ListScreenState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
        is ListScreenState.Success -> {
            RenderListingScreen(
                state = result,
                onDetailsClicked = onDetailsClicked,
                onItemSwipe = onItemSwipe,
                resetFlag = resetFlag,
                onCountrySelected = onCountrySelected
            )
        }
    }
}

@Composable
internal fun RenderListingScreen(
    state: ListScreenState.Success,
    onDetailsClicked: (Unit) -> Unit,
    onItemSwipe: (TouristPlace, Int) -> Unit,
    resetFlag: () -> Unit,
    onCountrySelected: (Country) -> Unit
) {

    val scrollToStart = derivedStateOf { state.scrollToStart }
    Box {
        val painter = rememberAsyncImagePainter(state.currentTouristPlace.images.first())
        Image(
            painter, null,
            modifier = Modifier.fillMaxSize().blur(
                edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp)), radius = 10.dp
            ),
            contentScale = ContentScale.Crop,
        )

        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.align(Alignment.Start)) {
                Column {
                    WeatherView()
                    ListCountryChips(
                        state.countriesList,
                        state.selectedCountry.name,
                        onCountrySelected = onCountrySelected
                    )
                }
            }
            Box(modifier = Modifier.weight(1f, false)) {
                ImageSlider(
                    imagesList = state.selectedCountry.touristPlaces,
                    onDetailsClicked = onDetailsClicked,
                    scrollToStart = scrollToStart.value,
                    resetFlag = resetFlag,
                    onItemSwipe = onItemSwipe
                )
            }
            Box(modifier = Modifier.align(Alignment.End).padding(bottom = 16.dp).fillMaxWidth()) {
                Column {
                    Counter(
                        destinationsSize = state.countriesList.size,
                        selectedDestination = state.selectedItemIndex
                    )
                    Line()
                    VisitingPlacesList(
                        state.selectedCountry.touristPlaces.map { it.name },
                        state.currentTouristPlace.name
                    )
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
private fun ListCountryChips(
    list: List<Country>, selectedCountry: String, onCountrySelected: (Country) -> Unit
) {
    LazyRow(contentPadding = PaddingValues(8.dp), modifier = Modifier.padding(top = 16.dp)) {
        items(items = list) { country ->
            CountryChips(
                country.name, selectedCountry == country.name
            ) { onCountrySelected(country) }
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
internal fun ImageSlider(
    imagesList: List<TouristPlace>,
    scrollToStart: Boolean,
    onDetailsClicked: (Unit) -> Unit,
    onItemSwipe: (TouristPlace, Int) -> Unit,
    resetFlag: () -> Unit
) {
    val listState = rememberLazyListState()
    if (scrollToStart) {
        LaunchedEffect(scrollToStart) {
            listState.scrollToItem(0)
            resetFlag()
        }
    }
    var lastIndex = 0
    LazyRow(
        modifier = Modifier.padding(top = 8.dp).fillMaxSize(),
        state = listState,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(items = imagesList) { touristPlace ->

            val items = listState.visibleItemsWithThreshold(percentThreshold = 1.0f)
            if (items.isNotEmpty()) {
                val visibleItems = items.last()
                if (visibleItems != lastIndex) {
                    lastIndex = visibleItems
                    onItemSwipe(imagesList[lastIndex], lastIndex)
                }
            }

            val painter = rememberAsyncImagePainter(touristPlace.images.first())
            Card(elevation = 16.dp,
                modifier = Modifier.aspectRatio(ratio = (295.0 / 432.0).toFloat())
                    .clip(RoundedCornerShape(20.dp)),
                contentColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                onClick = { onDetailsClicked(Unit) }) {
                Box {
                    Image(
                        painter,
                        "imageUrl",
                        modifier = Modifier.aspectRatio(ratio = (295.0 / 432.0).toFloat()),
                    )
                    Column(
                        modifier = Modifier.padding(16.dp).align(Alignment.BottomCenter)
                    ) {
                        Text(
                            text = touristPlace.name, style = MaterialTheme.typography.h4.copy(
                                color = Color.White, fontWeight = FontWeight.Medium
                            )
                        )
                        Text(
                            text = touristPlace.shortDescription,
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
                                contentDescription = "Explore details",
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
internal fun Counter(destinationsSize: Int, selectedDestination: Int) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(top = 30.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(horizontalArrangement = Arrangement.Center) {
            Text(
                (selectedDestination + 1).toString(),
                style = MaterialTheme.typography.subtitle2.copy(
                    color = Color.White, fontSize = TextUnit(
                        24f, TextUnitType.Sp
                    )
                ),
                modifier = Modifier.align(Alignment.Bottom).padding(0.dp)
            )
            Text(
                "/$destinationsSize",
                style = MaterialTheme.typography.subtitle2.copy(color = Color.White),
                modifier = Modifier.align(Alignment.Bottom)
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back Arrow",
                tint = Color.White
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "Forward Arrow",
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
internal fun VisitingPlacesList(list: List<String>, name: String) {
    LazyRow(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        items(list) {
            Text(
                it,
                style = MaterialTheme.typography.body1.copy(
                    color = if (it == name) Color.White else Color.White.copy(
                        alpha = 0.7f
                    ), fontWeight = if (it == name) FontWeight.SemiBold else FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 8.dp)
                    .background(Color.Transparent),
            )
        }
    }
}

@Composable
private fun LazyListState.visibleItemsWithThreshold(percentThreshold: Float): List<Int> {

    return remember(this) {
        derivedStateOf {
            val visibleItemsInfo = layoutInfo.visibleItemsInfo
            if (layoutInfo.totalItemsCount == 0) {
                emptyList()
            } else {
                val fullyVisibleItemsInfo = visibleItemsInfo.toMutableList()
                val lastItem = fullyVisibleItemsInfo.last()

                val viewportHeight = layoutInfo.viewportEndOffset + layoutInfo.viewportStartOffset

                if (lastItem.offset + (lastItem.size * percentThreshold) > viewportHeight) {
                    fullyVisibleItemsInfo.removeLast()
                }

                val firstItemIfLeft = fullyVisibleItemsInfo.firstOrNull()
                if (firstItemIfLeft != null && firstItemIfLeft.offset + (lastItem.size * percentThreshold) < layoutInfo.viewportStartOffset) {
                    fullyVisibleItemsInfo.removeFirst()
                }

                fullyVisibleItemsInfo.map { it.index }
            }
        }
    }.value
}