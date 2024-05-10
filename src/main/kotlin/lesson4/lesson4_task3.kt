package org.example.lesson4

fun main() {

    val sunnyWeather = true
    val tentOpen = true
    val humidity = 20
    val season = "зима"

    val conditionsSuitable =
        sunnyWeather && tentOpen && humidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}