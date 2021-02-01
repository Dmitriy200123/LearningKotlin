import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val n = scan.nextInt()
    val words = Array<String>(10){""}
    for (i in n-1 downTo 0)
        words[i] = scan.next().reversed()
    println(words.joinToString(" "))
}