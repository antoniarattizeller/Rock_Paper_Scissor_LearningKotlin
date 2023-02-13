
fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = Game().getGameChoice(options)
    val userChoice = Game().getUserChoice(options)
    println("userChoice $userChoice")
    println("gameChoice $gameChoice")
    Game().printResult(userChoice, gameChoice)
}