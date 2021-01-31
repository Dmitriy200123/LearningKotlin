import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val values = scan.nextLine().split(' ')
    println(values[0].replace(values[1], "_"))
}