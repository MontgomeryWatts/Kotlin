package DestructuringDeclarationsandDataClasses

//First look at data classes

data class User(val name: String, val id: Int)

fun getUser() : User{
    return User("Montgomery", 50)
}

fun main(args: Array<String>){
    val (name, id) = getUser()
    println("Name is $name, and ID is $id.")

    val (name2, _) = getUser()
    println("Name is $name2, and ID is not retrieved.")
}