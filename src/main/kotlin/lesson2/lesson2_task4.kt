package org.example.lesson2

fun main(){

    val crystalOre = 7
    val ironОre = 11
    val buffPercentages = 20

    val crystalOreBonus = crystalOre * (buffPercentages.toFloat() / TOTAL_PERCENT)
    val ironОreBonus = ironОre * (buffPercentages.toFloat() / TOTAL_PERCENT)

    println("Бонус к кристаллической руде: ${crystalOreBonus.toInt()} \nБонус к железной руде: ${ironОreBonus.toInt()}")


}
val TOTAL_PERCENT = 100