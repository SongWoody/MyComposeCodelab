package com.example.mycomposecodelab

import android.util.Log
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
        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task ->
            Log.i("WellnessTasksList","${task.id}")
            list.remove(task)
        })
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }