fun main() {
    val name = "Bill"
    val age  = 30
    val GPA = 4.0

    println("==== User Info ====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")

    var department:String?
    department = null
    department = "Software Engineering"
    print("Department: ${department!!}")
}