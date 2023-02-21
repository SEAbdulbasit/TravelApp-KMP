package com.example.travelapp_kmp.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.toSize
import com.example.traveapp_kmp.CommonView

@Composable
fun AppViewAndroid() {
    val size = remember { mutableStateOf(IntSize.Zero) }

    Box(Modifier.fillMaxSize().onGloballyPositioned { coordinates ->
        size.value = coordinates.size
    }) {

        CommonView(size.value.toSize().width * 0.4.toFloat())
    }
}
