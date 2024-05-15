package org.example.lesson4

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val conditionsSuitable = IS_SUNNY == isSunny &&
            IS_AWNING_OPEN == isAwningOpen &&
            HUMIDITY == humidity &&
            NOT_A_SEASON != currentSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val NOT_A_SEASON = "зима"