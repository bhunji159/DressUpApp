package com.example.dressupapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dressupapp.ui.screen.DressUpScreen
import com.example.dressupapp.ui.theme.DressUpAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DressUpAppTheme {
                DressUpScreen(



                )
            }
        }
    }
}

