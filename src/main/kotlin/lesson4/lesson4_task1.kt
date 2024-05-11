package org.example.lesson4

fun main(){

    val totalTables = 13
    val bookedToday = 13
    val bookedForTomorrow = 4

    val freeTablesToday = totalTables > bookedToday
    val freeTablesTomorrow = totalTables > bookedForTomorrow

    println("Доступность столиков на сегодня: $freeTablesToday\n" +
            "Доступность столиков на завтра: $freeTablesTomorrow")

}