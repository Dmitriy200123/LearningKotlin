import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val result = when (scan.nextLine().length){
        in 1 .. 10 -> "A"
        20 -> "B"
        15 -> "C"
        else -> "D"
    }
    println(result)
}