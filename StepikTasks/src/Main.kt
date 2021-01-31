import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val number = scan.nextInt()
    val result = (number % 10) * (number / 10)
    println(result)
}