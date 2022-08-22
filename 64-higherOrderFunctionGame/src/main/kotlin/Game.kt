class Game(var path: MutableList<Direction> = mutableListOf(Direction.START)) {

    var east = {
        this.path.add(Direction.EAST)
    }

    var west = {
        this.path.add(Direction.WEST)
    }

    var north = {
        this.path.add(Direction.NORTH)
    }

    var south = {
        this.path.add(Direction.SOUTH)
    }

    var end: () -> Boolean = {
        this.path.add(Direction.END)
        println("game over")
        println(this.path)
        this.path.clear()
        false
    }

}