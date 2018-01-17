package random

import java.util.Random

fun rollDice() : Int{
    val random = Random()
    return random.nextInt(6) + 1

}

fun main(args: Array<String>){
    if(args.size == 0){
        println("Enter an argument.")
        return
    }
    try{
        val times = args[0].toInt()
        for (time in 1..times)
            println("You roll a " + rollDice())
    } catch(nfe : NumberFormatException){
        println("You did not enter an integer.")
    }
}