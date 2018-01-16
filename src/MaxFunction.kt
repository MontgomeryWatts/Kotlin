fun main(args: Array<String>){
    if(args.size != 2){
        println("Enter two integers.")
        return
    }
    println(max(args[0].toInt(), args[1].toInt()))
}

fun max(a: Int, b: Int) = if(a > b) a else b