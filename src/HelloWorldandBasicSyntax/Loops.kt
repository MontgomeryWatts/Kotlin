package HelloWorldandBasicSyntax

//Quick look at loops, for loop similar to Python..

fun main(args: Array<String>){
    var i = 0;
    println("While loop")
    while(i < 10)
        println(i++)

    println("\ndo-while loop")
    var j = 0;
    do{
        println(j++)
    } while(j <= 10)

    println("\nFor loop")
    for(x in 1..5)
        println(x)
}