package random

fun cipher(char: Char, offset: Int) : Char? {
    if(!char.isLetter())
        return char
    else {
        try {
            var charNum = char.toInt()
            val actualOffset = if (offset > 0) offset % 25 else 26 - (-1 * (offset % 25))
            charNum += actualOffset
            if (charNum > 122)
                charNum -= 26
            return charNum.toChar()
        } catch (nfe: NumberFormatException) {
            println("Error")
        }
        return null
    }
}

fun main(args : Array<String>){
    var allArgs = ""
    for(arg in args)
        allArgs += arg + " "
    for(c in allArgs)
        print(cipher(c.toLowerCase(), -865))
}