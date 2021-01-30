import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val line = scan.nextLine()
    println("${line[0]}F${line.substring(2, line.length-2)}L${line.last()}")
}