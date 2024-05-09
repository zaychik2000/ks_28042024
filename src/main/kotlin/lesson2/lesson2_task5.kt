package org.example.lesson2

fun main(){
    val initialAmount = 70_000
    val interestRate = 16.7
    val yearsOfContribution = 20

    val contributionAfter20Years = initialAmount *
            Math.pow(1 + interestRate / TOTAL_PERCENT, yearsOfContribution.toDouble())

    val formattedContribution = String.format("%.3f", contributionAfter20Years)
    println("Размер вклада: $formattedContribution")
}

const val TOTAL_PERCENT = 100