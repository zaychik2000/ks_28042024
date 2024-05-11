package org.example.lesson5

fun main() {

    println("Пожалуйста, решите пример: 3 + 21 =")

    val answerToExample = readln().toInt()

    if (answerToExample == 24) println("Добро пожаловать!")
    else println("Доступ запрещен")
}