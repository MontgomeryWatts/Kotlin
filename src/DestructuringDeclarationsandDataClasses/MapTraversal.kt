package DestructuringDeclarationsandDataClasses

//Hashmap traversal, uses destructuring as well.

fun main(args: Array<String>){
    val map = hashMapOf<String, Int>()
    map.put("One", 1)
    map.put("Two", 2)
    for((key, value) in map)
        println("$key: $value")
}