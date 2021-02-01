import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val numbers = IntArray(10) { 0 }
    for (i in 0 until 10)
        numbers[i] = scan.nextInt()
    println(numbers.reversedArray().joinToString(" "))
}