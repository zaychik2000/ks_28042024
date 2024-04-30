package org.example.lesson2

fun main() {

    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val averageScore = (student4 + student3 + student2 + student1) / 4.0

    println("%.2f".format(averageScore))
}