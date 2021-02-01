import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    var maxNumber = Int.MIN_VALUE
    var maxNumberIndex = -1
    var currentPos = 1
    while(scan.hasNextInt()){
        val currentNumber = scan.nextInt()
        if (maxNumber < currentNumber){
            maxNumber = currentNumber
            maxNumberIndex = currentPos
        }
        currentPos++
    }
    println("$maxNumber $maxNumberIndex")
}