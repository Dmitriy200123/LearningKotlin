import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val values = scan.nextLine().split(' ')
    val pipeDescription = values[0]
    val breakdownSymbol = values[1]
    val result = when{
        pipeDescription.startsWith(breakdownSymbol) -> 1
        pipeDescription.endsWith(breakdownSymbol) -> 3
        pipeDescription.contains(breakdownSymbol) -> 2
        else -> 4
    }
    println(result)
}