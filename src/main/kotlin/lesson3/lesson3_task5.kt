package org.example.lesson3

fun main(){
    val inputString = "D2-D4;0"

    val (moves, number) = inputString.split(";")

    val (fromWhere, toWhere) = moves.split("-")

        println("$fromWhere, $toWhere, $number")
}