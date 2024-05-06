package org.example.lesson1

fun main() {

    val hours = TOTAL_SECONDS / SECOND_IN_AN_HOUR
    val minuts = (TOTAL_SECONDS % SECOND_IN_AN_HOUR) / SECOND_IN_AN_MINUTE
    val seconds = TOTAL_SECONDS % SECOND_IN_AN_MINUTE

    val formattedTime = "%02d:%02d:%02d".format(hours, minuts, seconds)
    println("Время, проведенное в космосе: \n$formattedTime")
}

val SECOND_IN_AN_HOUR = 3600
val SECOND_IN_AN_MINUTE = 60
val TOTAL_SECONDS = 6480