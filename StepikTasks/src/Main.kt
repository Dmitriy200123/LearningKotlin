import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(scan
        .nextLine()[0]
        .toString()
        .repeat(3)
        .toCharArray()
        .joinToString(" "))
}