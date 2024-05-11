package org.example.lesson5

fun main(){

    println("Введите год своего рождения")
    val usersYearOfBirth = readLine()!!.toInt()

    val userAge = THIS_YEAR - usersYearOfBirth

    if(userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")

    else println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18
const val THIS_YEAR = 2024



