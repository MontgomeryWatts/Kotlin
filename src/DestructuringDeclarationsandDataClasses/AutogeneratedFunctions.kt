package DestructuringDeclarationsandDataClasses

//Look at how Kotlin's autogenerated function work.
//The "User" data class was previously declared in DataClass.kt

fun main(args: Array<String>){
    val user = User("Montgomery", 50)
    println(user)

    val user2 = User("Eric", 1)
    val user3 = User("Montgomery", 50)

    println("user == user2: ${user == user2}")
    println("user == user3: ${user == user3}")

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))
    println(user.copy("Max", 2))
}