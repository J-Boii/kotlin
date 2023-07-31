fun main() {
    print("Number: ")
    var intOne = readLine().toInt()
    print("Operator: ")
    var op: String? = readLine()
    print("Number: ")
    var intTwo: Int? = readLine()

    when(op) {
        "+" -> println((intOne.toInt() + intTwo.toInt()))
        "-" -> println((intOne.toInt() - intTwo.toInt()))
        "/" -> println((intOne.toInt() / intTwo.toInt()))
        "*" -> println((intOne.toInt() * intTwo.toInt()))

        else -> println("oops")
    }
}