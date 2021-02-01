import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val numberFromString = scan.nextLong().inc().toString().toCharArray()
    numberFromString[numberFromString.lastIndex-1] = 'Ж'
    println(numberFromString)
}