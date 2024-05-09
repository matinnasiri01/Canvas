package me.nasiri.canvas

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

val randomNumberFlow = flow {
    while (true) {
        emit((1..30).random())
        delay(1000)
    }
}

val randomNumberState: State<Int>
    @Composable
    get() = randomNumberFlow.collectAsState(initial = 0)