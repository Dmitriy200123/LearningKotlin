import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    var maxNumber = Int.MIN_VALUE
    while(scan.hasNextInt()){
        val currentNumber = scan.nextInt()
        if (maxNumber < currentNumber)
            maxNumber = currentNumber
    }
    println(maxNumber)
}