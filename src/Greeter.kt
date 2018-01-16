class Greeter(val name: String){
    fun greet(){
        println("Hello $name!")
    }
}
fun main(args: Array<String>){
    if(args.size == 0) {
        println("Please enter your first name.")
        return
    }
    Greeter(args[0]).greet()
}