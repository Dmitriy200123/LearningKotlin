import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    scan.nextLine()
        .toLowerCase()
        .toCharArray()
        .forEachIndexed{ index, symbol -> if (index % 2 == 0) print(symbol.toUpperCase()) else print(symbol)}
}