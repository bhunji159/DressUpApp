package com.example.dressupapp.ui.component
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.dressupapp.model.Part
import com.example.dressupapp.R

@Composable
fun CharacterDisplay(partsVisible: Map<Part, Boolean>, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(painterResource(R.drawable.body), contentDescription = "Body")
        Part.values().forEach { part ->
            if (partsVisible[part] == true) {
                Image(painterResource(part.resId), contentDescription = null)
            }
        }
    }
}