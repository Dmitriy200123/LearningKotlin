import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val p = scan.nextDouble()
    val h = scan.nextDouble()
    val pressure = Math.round(p * h * 9.8)
    println(pressure)
}