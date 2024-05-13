package org.example.lesson5

fun main() {

    val number1 = 3
    val number2 = 21

    val answerToExample = number1 + number2

    println("Пожалуйста, решите пример: $number1 + $number2 =")

    val userResponse = readln().toInt()

    if (answerToExample == userResponse) println("Добро пожаловать!")
    else println("Доступ запрещен")
}
