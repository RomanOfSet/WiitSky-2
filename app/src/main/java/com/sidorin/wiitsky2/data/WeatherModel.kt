package com.sidorin.wiitsky2.data

data class WeatherModel(
    val city: String,
    val time: String,
    val currentTemp: String,
    val minTemp: String,
    val maxTemp: String,
    val condition: String,
    val icon: String,
    val hours: String
)
