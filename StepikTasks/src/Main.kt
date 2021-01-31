import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val first = scan.nextInt()
    val second = scan.nextInt()
    println(if ((first + second) % 2 == 0) Math.min(first, second) else Math.max(first, second))
}