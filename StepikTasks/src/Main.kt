import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val numbers = IntArray(10) { scan.nextInt() }
    println(numbers.reversedArray().joinToString(" "))
}