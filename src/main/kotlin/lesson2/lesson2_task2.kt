package org.example.lesson2

fun main(){

    val theТumberОfЕmployees = 50
    val employeeSalaries = 30_000

    val expensesForPermanentEmployees = theТumberОfЕmployees * employeeSalaries

    val numberOfTrainees = 30
    val traineeSalary = 20_000

    val totalSalaryOfInterns = numberOfTrainees * traineeSalary

    val generalExpenses = expensesForPermanentEmployees + totalSalaryOfInterns

    val averageSalary = generalExpenses /(theТumberОfЕmployees + numberOfTrainees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesForPermanentEmployees руб.")
    println("Общие расходы по ЗП после прихода стажеров: $generalExpenses руб.")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary руб.")
}