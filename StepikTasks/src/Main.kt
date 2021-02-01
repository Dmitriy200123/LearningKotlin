import java.util.*

val scan = Scanner(System.`in`)
fun main() {
    val s1 = scan.next()
    val s2 = scan.next()

    if(scan.hasNext()) // Если на вход подается Boolean
        print(check(s1,s2,scan.nextBoolean()))
    else
        print(check(s1,s2))
}

fun check(first: String, second: String, ignoreCase: Boolean = false)
        = first[0].equals(second[0], ignoreCase)
