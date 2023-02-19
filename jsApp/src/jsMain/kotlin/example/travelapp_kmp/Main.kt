package example.travelapp_kmp

import AppViewWeb
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("Travel App") {
            AppViewWeb()
        }
    }
}

