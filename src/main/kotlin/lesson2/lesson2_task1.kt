package org.example.lesson2

fun main() {

    val studentScore1 = 3
    val studentScore2 = 4
    val studentScore3 = 3
    val studentScore4 = 5

    val averageScore = (studentScore4 + studentScore3 + studentScore2 + studentScore1) / 4.0

    println("%.2f".format(averageScore))
}