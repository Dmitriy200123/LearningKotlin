import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(scan.nextInt())
}

open class Cat(val name: String){
    open fun play(){
        println("base")
    }
}

class MyCat(name: String): Cat(name){
    override fun play() {
        println("мяу!")
    }
}