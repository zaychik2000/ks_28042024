package org.example.lesson1

fun main(){

    val totalseconds = 6480
    val hours = totalseconds / 3600
    val minuts = (totalseconds % 3600)/60
    val seconds = totalseconds % 60

    val formattedTime = "%02d:%02d:%02d".format(hours, minuts, seconds)
    println("Время, проведенное в космосе: \n$formattedTime")
}