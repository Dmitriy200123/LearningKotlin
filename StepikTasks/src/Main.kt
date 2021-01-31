import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val first = Math.round(scan.nextDouble())
    val second = Math.round(scan.nextDouble())
    println(if (first == second) "Да" else "Нет")
}