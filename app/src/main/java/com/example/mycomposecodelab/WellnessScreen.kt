package com.example.mycomposecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }
    Column(modifier) {
        StatelessCounter(
            count,
            { count++ },
            modifier)
        WellnessTaskList()
    }
}