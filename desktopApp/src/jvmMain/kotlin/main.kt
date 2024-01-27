import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.travelapp_kmp.AppViewDesktop

fun main() = application {
    Window(title = "TravelApp", onCloseRequest = ::exitApplication) {
        AppViewDesktop()
    }
}