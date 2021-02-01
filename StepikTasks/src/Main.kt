import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    var balance = scan.nextInt()
    var operations = 0
    while (scan.hasNextInt()){
        val currentOperation = scan.nextInt()
        if (balance + operations + currentOperation < 0) {
            balance += operations
            println("Баланс - $balance руб, нужно - ${Math.abs(currentOperation)} руб")
            return
        }
        operations += currentOperation
    }
    balance += operations
    println("Баланс - $balance руб")
}