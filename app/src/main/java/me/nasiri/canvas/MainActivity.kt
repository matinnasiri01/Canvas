package me.nasiri.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import me.nasiri.canvas.ui.theme.CanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTheme {
                Canvas(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp)
                ) {
                    drawCircle(
                        color = Color.Red,
                        radius = 90f,
                        style = Stroke(width = 15f, cap = StrokeCap.Round)
                    )
                }
            }
        }
    }
}