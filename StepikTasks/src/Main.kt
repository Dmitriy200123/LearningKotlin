import java.util.*
import kotlin.math.abs

val scan = Scanner(System.`in`)
fun main(){
    when (abs(scan.nextInt())){
        in 10 .. 99 -> println("A")
        in 100 .. 999 -> println("B")
        else -> println("C")
    }
}