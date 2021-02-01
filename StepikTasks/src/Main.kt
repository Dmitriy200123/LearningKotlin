import java.util.*

val scan = Scanner(System.`in`)
fun main() {
    val s = scan.next()
    print(isCapitalized(s))
}

fun isCapitalized(s: String): Boolean{
    return s.first().isUpperCase()
}