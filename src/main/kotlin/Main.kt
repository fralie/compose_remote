import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Greeting()
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.Blue),
        contentAlignment = Alignment.BottomCenter
    ) {
        Text(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .background(color = Color.Red),
            text = "Hello, RPZ-201"
        )
        Button(onClick = {}) {
            Text("Button")
        }
    }
}
