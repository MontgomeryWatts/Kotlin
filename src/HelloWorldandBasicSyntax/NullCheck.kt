package HelloWorldandBasicSyntax

//First encounter with nullable values

fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (nfe: NumberFormatException) {
        println("$str is not an integer.")
    }
    return null
}

fun main(args: Array<String>){
    if(args.size != 2){
        println("Two arguments were not provided")
        return
    }
    val x = parseInt(args[0])
    val y = parseInt(args[1])
    if(x != null && y != null){
        println("$x * $y = ${x * y}")
    }
}