import java.util.*

val scan = Scanner(System.`in`)
fun main() {
    val c1 = scan.next()[0]
    val c2 = scan.next()[0]
    print(isCaseEquals(c1,c2))
}

fun isCaseEquals(firstSymbol: Char, secondSymbol: Char): Boolean{
    return firstSymbol.isUpperCase() && secondSymbol.isUpperCase()
                || firstSymbol.isLowerCase() && secondSymbol.isLowerCase()
}