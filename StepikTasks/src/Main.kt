import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(if (scan.nextLine().length % 2 == 0) "even" else "odd")
}