import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val names = scan.nextLine().split(' ').map { it.capitalize() }.joinToString(" " )
    println(names)
}