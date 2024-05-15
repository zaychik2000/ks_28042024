package org.example.lesson5

fun main(){

    val thisYear = 2024

    println("Введите год своего рождения")
    val usersYearOfBirth = readln().toInt()

    val userAge = thisYear - usersYearOfBirth

    if(userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")

    else println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18



