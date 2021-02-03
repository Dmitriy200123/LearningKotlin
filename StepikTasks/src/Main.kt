import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(scan.nextInt())
}

enum class LogLevel {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

fun logMessage(level: LogLevel, message: String) {
    println("[${level.name}]: $message")
}