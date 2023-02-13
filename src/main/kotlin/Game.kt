class Game {
    //function that returns Array Index of the random chosen GameChoice from the option-Array
    fun getGameChoice(optionsParam: Array<String>) =
        optionsParam[(Math.random() * optionsParam.size).toInt()]

    fun getUserChoice(optionsParam: Array<String>): String {
        var isValidChoice = false
        var userChoice = ""
        //Loop until the user enters valid choice:
        while (!isValidChoice) {
            //Ask the user for their choice
            print("Please enter one of the following:")
            for (item in optionsParam) print(" $item")
            println(".")
            //Read user input
            val userInput = readLine()
            //validation of user Input
            if (userInput != null && userInput in optionsParam) {
                //update variables
                isValidChoice = true
                userChoice = userInput
            }
            //invalid user input then inform user:
            if (!isValidChoice) println("please enter a valid choice.")
        }
        return userChoice
    }


    fun printResult(userChoice: String, gameChoice: String): Unit {
        if(userChoice == gameChoice) println("Tie")
        if((userChoice == "Rock" && gameChoice == "Scissors")||(userChoice == "Paper" && gameChoice == "Rock"))
            println(" You won!")
        else println("I won! haha")
    }
}

