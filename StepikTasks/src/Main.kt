import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val m = scan.nextDouble()
    val n = scan.nextDouble()
    println(Math.ceil(m / n).toInt())
}