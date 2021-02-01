import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    var balance = scan.nextLine().toInt()
    while (scan.hasNextInt()){
        val currentProduct = scan.nextInt()
        if (balance < currentProduct){
            println("Баланс - $balance руб, нужно - $currentProduct руб")
            return
        }
        balance -= currentProduct
    }
    println("Баланс - $balance руб")
}