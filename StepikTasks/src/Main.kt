import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val numbers = Array(4) { _ -> scan.nextInt() }
    println(if (scan.nextBoolean()) numbers.min() else numbers.max())
}