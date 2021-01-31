import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val symbol = scan.next()[0]
    when{
        !symbol.isLetter() -> print("incorrect")
        symbol.isLowerCase() -> print(symbol.toUpperCase())
        else -> print(symbol.toLowerCase())
    }
}