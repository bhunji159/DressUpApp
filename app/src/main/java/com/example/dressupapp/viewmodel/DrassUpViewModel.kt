package com.example.dressupapp.viewmodel

import androidx.compose.runtime.mutableStateMapOf
import androidx.lifecycle.ViewModel
import com.example.dressupapp.model.Part
import com.example.dressupapp.model.defaultPartVisibility

class DressUpViewModel : ViewModel() {
    private val _partsVisible = mutableStateMapOf<Part, Boolean>().apply {
        putAll(defaultPartVisibility())
    }
    val partsVisible: Map<Part, Boolean> = _partsVisible

    fun toggle(part: Part) {
        _partsVisible[part] = !(_partsVisible[part] ?: false)
    }
}
