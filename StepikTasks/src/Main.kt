import java.util.*

val scan = Scanner(System.`in`)
fun main() {
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(calc(a,b))
}

fun calc(a: Int, b: Int): Int{
    return 7 * (a * a - b * b * b)  * (a - b)
}
