import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        SingleNote()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingleNote() {
    Scaffold {
        Box(modifier = Modifier.background(color = Color.Cyan)) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 150.dp),
                modifier = Modifier.align(
                    Alignment.BottomCenter
                ).fillMaxWidth(),
                verticalArrangement = Arrangement.Bottom,
                horizontalArrangement = Arrangement.Center
            ) {
                items(4) {
                    val title = when (it) {
                        0 -> "A"
                        1 -> "B"
                        2 -> "C"
                        3 -> "D"
                        else -> "D"
                    }
                    Button(onClick = {}) {
                        Text(title)
                    }
                }
            }
        }
    }
}

expect fun getPlatformName(): String