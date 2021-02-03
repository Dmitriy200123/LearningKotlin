import java.util.*

val scan = Scanner(System.`in`)

fun main(){
    enableMyComputer(Computer())
}

fun enableMyComputer(computer: Computer){
    computer.enable()
}

open class Computer {
    open fun enable() {
        println("вшшшшшшшшшш")
    }
}