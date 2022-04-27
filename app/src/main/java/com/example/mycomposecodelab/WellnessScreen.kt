package com.example.mycomposecodelab

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }
    StatelessCounter(
        count,
        { count++ },
        modifier)
}