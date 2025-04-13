package com.example.dressupapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dressupapp.ui.component.CharacterDisplay
import com.example.dressupapp.ui.component.PartsSelector
import com.example.dressupapp.viewmodel.DressUpViewModel

@Composable
fun DressUpScreen(
    modifier: Modifier = Modifier,
    viewModel: DressUpViewModel = viewModel()
) {
    val partsVisible = viewModel.partsVisible
    val configuration = LocalConfiguration.current
    val isLandscape = configuration.orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE

    if (isLandscape) {
        Row(
            modifier = modifier.fillMaxSize().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CharacterDisplay(partsVisible, Modifier.fillMaxHeight().wrapContentSize(Alignment.Center))
            Spacer(modifier = Modifier.width(16.dp))
            Box(modifier = Modifier.wrapContentSize(Alignment.Center)) {
                PartsSelector(partsVisible, viewModel::toggle)
            }
        }
    } else {
        Column(
            modifier = modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CharacterDisplay(partsVisible, Modifier.fillMaxWidth().wrapContentSize(Alignment.Center))
            Spacer(modifier = Modifier.height(16.dp))
            PartsSelector(partsVisible, viewModel::toggle)
        }
    }
}