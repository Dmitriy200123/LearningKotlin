import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val motherSalary = scan.nextInt()
    val fatherSalary = scan.nextInt()
    val peopleCount = scan.nextInt()
    val tripCost = 100000
    val averageSalary = (motherSalary + fatherSalary) / peopleCount
    val discountShare = when {
        averageSalary >= 20000 -> 0.0
        averageSalary < 10000 -> 0.5
        averageSalary < 12000 -> 0.4
        averageSalary < 16000 -> 0.3
        averageSalary < 18000 -> 0.2
        averageSalary < 20000 -> 0.1
        else -> throw IllegalArgumentException("Неверная цена путевки")
    }

    println((discountShare * tripCost).toInt())
}