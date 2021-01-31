import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val number = scan.nextDouble()
    val result = Math.round(Math.PI * number * number)
    println(result)
}