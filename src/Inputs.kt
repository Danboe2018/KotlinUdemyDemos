fun main() {
    print("Enter Name: ")
    val name = readLine()!!.toString()
    print("Enter Age: ")
    val age = readLine()!!.toInt()
    print("Enter GPA: ")
    val GPA = readLine()!!.toDouble()

    println("==== User Info ====")
    println("Your Name is: $name")
    println("Your Age is: $age")
    println("Your GPA is: $GPA")
}