package org.example.lesson5

fun main(){
    val lotteryNumbers = 0 ..42

    val correctNumber1 = 32
    val correctNumber2 = 18

    println("Введите первое число от 0 до 42")
    val number1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val number2 = readln().toInt()

    if (number1 == correctNumber1 &&
        number2 == correctNumber2) println("Правильные числа: " +
            "$correctNumber1 и $correctNumber2" +
            "\nПоздравляем! Вы выиграли главный приз!")

    else if (number1 == correctNumber1 &&
        number2 != correctNumber2 ||
        number1 != correctNumber1 &&
        number2 == correctNumber2) println("Правильные числа: " +
            "$correctNumber1 и $correctNumber2" +
            "\nВы выиграли утешительный приз!")

    else println("Правильные числа: " +
            "$correctNumber1 и $correctNumber2" +
            "\nНеудача!")

}