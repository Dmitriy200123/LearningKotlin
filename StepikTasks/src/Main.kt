import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val numbers = IntArray(scan.nextInt()){scan.nextInt()}
    val desiredNumber = scan.nextInt()
    println(numbers.filter { it == desiredNumber }.sum())
}