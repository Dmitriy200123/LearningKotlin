import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val values = Array(6){_ -> scan.nextInt()}
    val tripCost = values[0] * values[1] * values[4] + values[2] * values[4] + 2 * values[3] - values.last()
    println(tripCost)
}