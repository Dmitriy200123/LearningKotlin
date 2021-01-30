import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val currentLine = scan.nextLine()
    println(currentLine.replaceFirst(currentLine[0], 'Q'))
}