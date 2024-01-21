import kotlin.system.exitProcess
fun greeting() {
    println("""
        ======= CALCULATOR ======
        Made by: Usamah As Salafi
        
    """.trimIndent())
}
fun showMenu() {
    println("""
        Choose the operator:
        1. (+)
        2. (-)
        3. (x)
        4. (/)
        5. Exit
    """.trimIndent())
}
fun main() {
    // Show greeting message
    greeting()

    // Prompt user to choose the operator
    showMenu()
    // Take user input for the operator they choose
    var userInput: String = readln()

    while (userInput.isBlank()) {
        println("Please choose one!")
        println("")
        showMenu()
        userInput = readln()

    }
    when (userInput) {
        "1" -> {
            val sum = fun(num1: Long, num2: Long): Long { return num1 + num2 }
            print("Operand 1: ")
            val operand1 = readln().toLong()
            print("Operand 2: ")
            val operand2 = readln().toLong()
            println("Result: ${sum(operand1,operand2)}")

        }
        "2" -> {
            val difference = fun(num1: Long, num2: Long): Long { return num1 - num2 }
            print("Operand 1: ")
            val operand1 = readln().toLong()
            print("Operand 2: ")
            val operand2 = readln().toLong()
            println("Result: ${difference(operand1,operand2)}")
        }
        "3" -> {
            val product = fun(num1: Long, num2: Long): Long { return num1 * num2 }
            print("Operand 1: ")
            val operand1 = readln().toLong()
            print("Operand 2: ")
            val operand2 = readln().toLong()
            println("Result: ${product(operand1,operand2)}")
        }
        "4" -> {
            val quotient = fun(num1: Double, num2: Double): Double { return num1 / num2 }
            print("Operand 1: ")
            val operand1 = readln().toDouble()
            print("Operand 2: ")
            val operand2 = readln().toDouble()
            println("Result: ${quotient(operand1,operand2)}")
        }
        "5" -> {
            println("Thanks for using this calculator! :)")
            exitProcess(0)
        }
    }
    println("===================")

//    showMenu()
//    if (userInput == "5"){
//        println("Thanks for using this calculator! :)")
//        exitProcess(0)
//    }




}



