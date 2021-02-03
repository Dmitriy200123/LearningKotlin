import java.util.*

val scan = Scanner(System.`in`)
fun main(){
    println(scan.nextInt())
}

interface PersonFormatter {
    fun format(person: Person?): String
}

class Address (
    val city: String,
    val street: String?
)

class Person (
    val name: String,
    val address: Address?
)

class SimplePersonFormatter: PersonFormatter{
    override fun format(person: Person?): String {
        if (person == null)
            return ""
        val name = person.name.capitalize()
        val city = person.address?.city?.capitalize() ?: return name
        val street = person.address.street?.toUpperCase() ?: return "$name ($city)"
        return "$name ($city, ул. $street)"
    }
}