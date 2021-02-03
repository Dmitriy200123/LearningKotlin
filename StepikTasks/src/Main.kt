import java.util.*

fun main(){
    println(Navigator()
        .getDestination(arrayOf(Direction.RIGHT, Direction.LEFT, Direction.DOWN, Direction.RIGHT, Direction.UP)))
}

enum class Direction {
    UP, RIGHT, DOWN, LEFT
}

class Navigator {
    fun getDestination(path: Array<Direction>): String {
        var coordinateX = 0
        var coordinateY = 0
        for (direction in path){
            when(direction){
                Direction.UP -> coordinateY++
                Direction.DOWN -> coordinateY--
                Direction.RIGHT -> coordinateX++
                Direction.LEFT -> coordinateX--
            }
        }

        return "(x: $coordinateX, y: $coordinateY)"
    }
}