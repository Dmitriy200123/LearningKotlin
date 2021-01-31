import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val values = scan.nextLine().split(' ')
    val result = values[0].replace(values[1], "_")
    println("$result ${result.count { it == '_' }}")
}