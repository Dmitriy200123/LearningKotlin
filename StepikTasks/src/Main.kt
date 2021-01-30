import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val first = scan.nextInt()
    val second = scan.nextInt()
    val operation = first / 100 + first % 10 + second / 100 + second % 10
    println(operation)
}