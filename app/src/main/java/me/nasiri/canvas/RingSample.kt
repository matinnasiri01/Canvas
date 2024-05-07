package me.nasiri.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun RingSample() {

    Canvas(
        modifier = Modifier.size(200.dp),
        onDraw = {

            val strokeWidth = 50f
            drawCircle(
                color = Color.Blue,
                radius = 200f,
                style = Stroke(
                    width = strokeWidth
                )
            )
        }
    )
}