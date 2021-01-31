import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val values = scan.nextLine().split(' ')
    val numbers = values.take(values.count() - 1).map { it.toInt() }
    println(if (values.last().toBoolean()) numbers.min() else numbers.max())
}