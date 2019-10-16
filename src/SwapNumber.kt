fun main() {

    print("Enter number1: ")
    var number1 = readLine()!!.toInt()

    print("Enter number2: ")
    var number2 = readLine()!!.toInt()

    var temp = 0;
    println("Number1: $number1, Number2: $number2")

    temp = number1
    number1 = number2
    number2 = temp

    println("Number1: $number1, Number2: $number2")
}