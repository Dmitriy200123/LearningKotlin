import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println((5 .. scan.nextInt() * 5 step 5).joinToString(" "))
}