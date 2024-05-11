package org.example.lesson3

fun main(){
    val inputString = "D2-D4;0"

    val (fromWhere, toWhere, number) = inputString.split(";", "-")

    println("$fromWhere, $toWhere, $number")
}