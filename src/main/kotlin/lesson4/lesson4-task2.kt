package org.example.lesson4

fun main() {

    val Weight1 = 20
    val Volume1 = 80

    val Weight2 = 50
    val voume2 = 100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':" +
            " ${Weight1 > MIN_WEIGHT_AVERAGE && Weight1 < MAX_WEIGHT_AVERAGE && Volume1 <= MAX_VOLUME_AVERAGE }")

    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':" +
            " ${Weight2 > MIN_WEIGHT_AVERAGE && Weight2 < MAX_WEIGHT_AVERAGE && voume2 <= MAX_VOLUME_AVERAGE }")



}

const val MAX_VOLUME_AVERAGE = 100
const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100