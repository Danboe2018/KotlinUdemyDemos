/*
This is a multi line
comment
using comments
 */

fun main() {
    // Ask for user name
    print("Enter Name: ")
    val name = readLine()!!.toString()
    // Ask for Age
    print("Enter Age: ")
    val age = readLine()!!.toInt()
    print("Enter GPA: ")
    val GPA = readLine()!!.toDouble()

    println("==== User Info ====")
    println("Your Name is: $name")
    println("Your Age is: $age")
    println("Your GPA is: $GPA")
}