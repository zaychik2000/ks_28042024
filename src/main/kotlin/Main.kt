package org.example

fun main() {

    println("Введите информацию о корабле")
    println("Корпус поврежден? (true/false):")
    val isDamaged: Boolean = readLine().toBoolean()

    println("Текущий состав экипажа:")
    val crewSize: Int = readLine()?.toInt() ?: 0

    println("Количество ящиков с провизией на борту:")
    val provisionBoxes: Int = readLine()?.toInt() ?: 0

    println("Благоприятность метеоусловий (true/false):")
    val isWeatherFavorable: Boolean = readLine().toBoolean()

    val canSetSail = (!isDamaged && crewSize in 55..70 && provisionBoxes > 50)
            || (isDamaged && crewSize == 70 && provisionBoxes >= 50 && isWeatherFavorable)

    println("Корабль может отправиться в плавание: $canSetSail")

}
