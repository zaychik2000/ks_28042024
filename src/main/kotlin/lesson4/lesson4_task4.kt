package org.example.lesson4

fun main(){

    val trainingDays = 5

    val ExercisesForArmsAndAbs = trainingDays % 2 != 0

    val ExercisesForlegsAndBack = trainingDays % 2 == 0

    println("Упражнения для рук:    $ExercisesForArmsAndAbs\n" +
            "Упражнения для ног:    $ExercisesForlegsAndBack\n" +
            "Упражнения для спины:  $ExercisesForlegsAndBack\n" +
            "Упражнения для пресса: $ExercisesForArmsAndAbs")

}