package org.example.lesson2

fun main(){

    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTimeInMinutes = 457

    val hoursOnTheRoad = travelTimeInMinutes / MINUTES_IN_AN_HOUR
    val minutesOnTheWay = travelTimeInMinutes % MINUTES_IN_AN_HOUR

    var arrivalHour = hourOfDeparture + hoursOnTheRoad
    var minuteOfArrival = minuteOfDeparture + minutesOnTheWay

    if (minuteOfArrival >= MINUTES_IN_AN_HOUR) {
        arrivalHour += 1
        minuteOfArrival %= MINUTES_IN_AN_HOUR
    }

    val formattedTime = "%02d:%02d".format(arrivalHour, minuteOfArrival)

    println("Час и минута прибытия поезда: $formattedTime")
}

 const val MINUTES_IN_AN_HOUR = 60