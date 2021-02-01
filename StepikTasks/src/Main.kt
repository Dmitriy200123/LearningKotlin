import java.util.*

val scan = Scanner(System.`in`)
fun main() {
    val s1 = scan.next()
    val s2 = scan.next()
    val b  = scan.nextBoolean()
    print(check(s1, s2, ignoreCase = b))
}

fun check(first: String, second: String, ignoreCase: Boolean = false)
    = first[0].equals(second[0], ignoreCase)
