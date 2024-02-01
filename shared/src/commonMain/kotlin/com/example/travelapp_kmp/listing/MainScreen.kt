package com.example.travelapp_kmp.listing

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.travelapp_kmp.screennavigation.Screen
import com.example.travelapp_kmp.screennavigation.ScreensState
import com.example.travelapp_kmp.style.TravelAppColors
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

//import org.jetbrains.compose.resources.resource


@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun MainScreen(
    navigationState: MutableState<ScreensState>, viewMode: ListScreenViewModel
) {
    val state = viewMode.state.collectAsState()
    MainScreenView(
        state = state,
        onDetailsClicked = {
            navigationState.value = ScreensState(screen = Screen.DetailScreen(it))
        },
        onCountrySelected = { viewMode.onAction(ListViewModelActions.OnCountrySelected(it)) },
        moveToIndex = { viewMode.onAction(ListViewModelActions.MoveToIndex(it)) },
    )
}

@Composable
internal fun MainScreenView(
    state: State<ListScreenState>,
    onDetailsClicked: (TouristPlace) -> Unit,
    onCountrySelected: (Country) -> Unit,
    moveToIndex: (Int) -> Unit,
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
                onCountrySelected = onCountrySelected,
                moveToIndex = moveToIndex,
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun RenderListingScreen(
    state: ListScreenState.Success,
    onDetailsClicked: (TouristPlace) -> Unit,
    onCountrySelected: (Country) -> Unit,
    moveToIndex: (Int) -> Unit,
) {

    val listState = rememberLazyListState()

    val visibleItems = listState.visibleItemsWithThreshold(percentThreshold = 0.3f)
    LaunchedEffect(visibleItems) {
        visibleItems.firstOrNull()?.let { moveToIndex(it) }
    }

    LaunchedEffect(state.selectedItemIndex) {
        listState.animateScrollToItem(state.selectedItemIndex)
    }

    val imageWidth = with(LocalDensity.current) {
        val screenWidth =
            MaterialTheme.typography.body1.fontSize * 40 // or any other way to get screen width
        (screenWidth * 0.85f)
    }

    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(state.selectedCountry.touristPlaces[state.selectedItemIndex].images[0]),
            contentDescription = null,
            modifier = Modifier.fillMaxSize().blur(32.dp),
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
                setToScale(
                    0.9f,
                    0.9f,
                    0.9f,
                    1f
                )
            }),
            contentScale = ContentScale.Crop,
        )

        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
            Column {
                WeatherView(state.selectedCountry.touristPlaces[state.selectedItemIndex].images[0])
                ListCountryChips(
                    state.countriesList,
                    state.selectedCountry.name,
                    onCountrySelected = onCountrySelected
                )
            }
            ImageSlider(
                imagesList = state.selectedCountry.touristPlaces,
                onDetailsClicked = onDetailsClicked,
                listState = listState,
                width = (imageWidth.value),
            )
            Column {
                Counter(
                    destinationsSize = state.selectedCountry.touristPlaces.size,
                    selectedDestination = state.selectedItemIndex,
                    onItemSwipe = moveToIndex
                )
                Line()
                VisitingPlacesList(
                    state.selectedCountry.touristPlaces.map { it.name },
                    state.selectedCountry.touristPlaces[state.selectedItemIndex].name
                )
            }
        }
    }
}


@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun WeatherView(drawableResource: DrawableResource) {
    Row(
        Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, top = 64.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(drawableResource),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(48.dp).clip(RoundedCornerShape(16.dp))
        )
        Column(Modifier.padding(start = 8.dp).align(Alignment.CenterVertically)) {
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
    LazyRow(contentPadding = PaddingValues(8.dp), modifier = Modifier.padding(8.dp)) {
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
            modifier = Modifier.padding(start = 24.dp, top = 8.dp, bottom = 8.dp, end = 24.dp)
                .background(Color.Transparent),
        )
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun ImageSlider(
    imagesList: List<TouristPlace>,
    onDetailsClicked: (TouristPlace) -> Unit,
    listState: LazyListState,
    width: Float,
) {
    LazyRow(
        modifier = Modifier.padding(top = 8.dp).fillMaxSize(),
        state = listState,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items = imagesList, key = { item: TouristPlace -> item.name }) { touristPlace ->
            Card(
                elevation = 16.dp,
                modifier = Modifier
                    .width(width = (width * 0.62).dp)
                    .aspectRatio(ratio = (295.0 / 432.0).toFloat())
                    .clip(RoundedCornerShape(20.dp)),
                contentColor = Color.Transparent,
            ) {
                Box {
                    Image(
                        painter = painterResource(touristPlace.images.first()),
                        contentDescription = null,
                        modifier = Modifier
                            .aspectRatio(ratio = (295.0 / 432.0).toFloat())
                            .background(TravelAppColors.SemiWhite),
                        contentScale = ContentScale.Crop
                    )

                    Column(
                        modifier = Modifier.padding(16.dp).align(Alignment.BottomStart)
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
                            overflow = TextOverflow.Ellipsis
                        )
                        Row(Modifier.padding(top = 20.dp)) {
                            Text(
                                modifier = Modifier.clickable(onClick = {
                                    onDetailsClicked(
                                        touristPlace
                                    )
                                }),
                                text = "Discover Place",
                                style = MaterialTheme.typography.subtitle2.copy(
                                    textDecoration = TextDecoration.Underline,
                                    color = Color.White,
                                    fontWeight = FontWeight.SemiBold
                                ),
                            )
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
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
internal fun Counter(destinationsSize: Int, selectedDestination: Int, onItemSwipe: (Int) -> Unit) {
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
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back Arrow",
                tint = if (selectedDestination > 0) Color.White else TravelAppColors.SemiWhite,
                modifier = Modifier.clickable(onClick = {
                    if (selectedDestination > 0) {
                        onItemSwipe(selectedDestination - 1)
                    }
                })
            )
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "Forward Arrow", modifier = Modifier.clickable(onClick = {
                    if (selectedDestination < (destinationsSize - 1)) {
                        onItemSwipe(selectedDestination + 1)
                    }
                }), tint = if (selectedDestination < (destinationsSize - 1)) Color.White else TravelAppColors.SemiWhite
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