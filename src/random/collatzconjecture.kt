package random

fun collatz(num: Int) : Int {
   return if (num % 2 == 0) num / 2 else (3 * num + 1)
}

fun main(args: Array<String>){
    if(args.size != 1){
        println("Enter a single argument.")
        return
    }
    try{
        var num = args[0].toInt()
        if(num < 1)
            println("Enter an integer greater than 1.")
        else{
            while(num > 1){
                println(num)
                num = collatz(num)
            }
        }
        println(num)
    } catch(nfe : NumberFormatException){
        println("An integer was not input.")
    }
}