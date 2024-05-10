package org.example.lesson4

fun main() {

    val maxVolumeAverage = 99
    val minWeightAverage = 35
    val maxWeightAverage = 100

    val Weight1 = 20
    val Volume1 = 80

    val Weight2 = 50
    val voume2 = 100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':" +
            " ${Weight1 > minWeightAverage && Weight1 < maxWeightAverage && Volume1 < maxVolumeAverage }")

    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':" +
            " ${Weight2 > minWeightAverage && Weight2 < maxWeightAverage && voume2 < maxVolumeAverage }")



}