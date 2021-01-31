import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val first = scan.nextInt()
    val second = scan.nextDouble()
    val result = when (first){
        1 -> Math.pow(second, second)
        2 -> Math.floor(second).toInt()
        3 -> Math.ceil(second).toInt()
        4 -> Math.round(second).toInt()
        5 -> Math.abs(second)
        6 -> Math.sqrt(second)
        else -> 2 * second * second
    }
    println(result)
}