package HelloWorldandBasicSyntax

//Small example with when(switch)

fun main(args: Array<String>){
    val language = if (args.size == 0) "EN" else args[0]
    println(when(language){
        "EN" -> "Hello!"
        "ES" -> "Hola!"
        "FR" -> "Bonjour!"
        else -> "I don't know how to greet you in your language."
    })
}