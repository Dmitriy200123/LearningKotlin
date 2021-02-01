import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val n = scan.nextInt()
    val k = scan.nextInt()
    println((k .. n * k step k).joinToString(" "))
}