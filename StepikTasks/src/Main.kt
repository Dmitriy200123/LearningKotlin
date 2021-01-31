import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val maxNumber = scan
        .nextLine()
        .split(' ')
        .map { it.toInt() }
        .maxOrNull()
    println(maxNumber)
}