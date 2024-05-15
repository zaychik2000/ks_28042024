package org.example.lesson5

fun main(){

    println("Введите информацию о корабле")
    println("Корпус поврежден? (true/false):")
    val isDamaged: Boolean = readln().toBoolean()
    println("Текущий состав экипажа:")
    val crewSize: Int = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val provisionBoxes: Int = readln().toInt()

    println("Благоприятность метеоусловий (true/false):")
    val isWeatherFavorable: Boolean = readln().toBoolean()

    val canSetSail = (!isDamaged &&
            crewSize >= MINIMUM_NUMBER_OF_PEOPLE &&
            crewSize <= MAX_NUMBER_OF_PEOPLE  &&
            provisionBoxes > MIN_NUMBER_OF_BOXES)
            ||
            (isDamaged && crewSize == MAX_NUMBER_OF_PEOPLE &&
            provisionBoxes >= MIN_NUMBER_OF_BOXES &&
            isWeatherFavorable)

    println("Корабль может отправиться в плавание: $canSetSail")
}

const val MIN_NUMBER_OF_BOXES = 50
const val MINIMUM_NUMBER_OF_PEOPLE = 55
const val MAX_NUMBER_OF_PEOPLE = 70