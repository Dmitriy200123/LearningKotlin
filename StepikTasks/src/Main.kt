import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(scan.nextInt())
}

open class Cat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}

class HomeCat: Cat(){
    fun hunt(isSimpleCat: Boolean) {
        if (isSimpleCat)
            super.hunt()
        else
            println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
    }
}