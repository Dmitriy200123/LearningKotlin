import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    val number = scan.nextInt()
    val result = when {
        number == 0 -> "Число равно нулю"
        number > 0 -> "Число положительное"
        else -> "Число отрицательное"
    }
    println(result)
}