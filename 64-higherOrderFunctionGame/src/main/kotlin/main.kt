fun main() {

    val game: Game = Game()

    println(game.path)
    game.east()
    game.west()
    game.north()
    game.south()

    game.end()

    println(game.path)

}
