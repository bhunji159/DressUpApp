package com.example.dressupapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.dressupapp.model.Part

@Composable
fun PartsSelector(
    partsVisible: Map<Part, Boolean>,
    onToggle: (Part) -> Unit
) {
    Column(horizontalAlignment = Alignment.Start) {
        Part.values().forEach { part ->
            PartToggle(name = part.displayName, checked = partsVisible[part] ?: false) {
                onToggle(part)
            }
        }
    }
}

@Composable
fun PartToggle(name: String, checked: Boolean, onToggle: () -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = checked, onCheckedChange = { onToggle() })
        Text(name)
    }
}