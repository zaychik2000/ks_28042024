package org.example.lesson1

fun main(){

    val year = "1961"

    var minute = "07"
    var hour = "09"

    println("Взлет: \n$year год \n$hour часов \n$minute минут")

    minute = "55"
    hour = "10"

    println("\nПосадка: \n${year}г $hour:$minute")
}