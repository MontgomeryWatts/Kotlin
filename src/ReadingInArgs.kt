fun main(args: Array<String>){
    if(args.size == 0){
        println("Please provide a name in the command line.")
        return
    }
    else if (args.size == 1)
        println("Hello ${args[0]}!")
    else
        for (name in args)
            println("Hello $name!")
}