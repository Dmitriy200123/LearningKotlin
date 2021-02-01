import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(Array(scan.nextInt()) {scan.next().reversed()}
        .reversedArray()
        .joinToString(" "))
}