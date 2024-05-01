package org.example.lesson1

fun main(){

    val secondsInAnHour = 3600
    val secondInAnMinute = 60
    val totalseconds = 6480

    val hours = totalseconds / secondsInAnHour
    val minuts = (totalseconds % secondsInAnHour) / secondInAnMinute
    val seconds = totalseconds % secondInAnMinute

    val formattedTime = "%02d:%02d:%02d".format(hours, minuts, seconds)
    println("Время, проведенное в космосе: \n$formattedTime")
}