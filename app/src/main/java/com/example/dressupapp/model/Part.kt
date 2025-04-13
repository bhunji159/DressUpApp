package com.example.dressupapp.model

import com.example.dressupapp.R

enum class Part(val displayName: String, val resId: Int) {
    ARMS("arms", R.drawable.arms),
    EARS("ears", R.drawable.ears),
    EYEBROWS("eyebrows", R.drawable.eyebrows),
    EYES("eyes", R.drawable.eyes),
    GLASSES("glasses", R.drawable.glasses),
    HAT("hat", R.drawable.hat),
    MOUTH("mouth", R.drawable.mouth),
    MUSTACHE("mustache", R.drawable.mustache),
    NOSE("nose", R.drawable.nose),
    SHOES("shoes", R.drawable.shoes);
}