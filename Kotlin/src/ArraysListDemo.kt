fun main() {
    println("Pets App")
    //Write App in Array
    var listOfPets = ArrayList<String>()
    do {
        print("Enter Pet name or quit to exit:")
        val petName = readLine()!!.toString().toLowerCase()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")

    println("Your pets Are using index")
    for (i in 0 until listOfPets.size) {
        println("Pet $i:  ${listOfPets[i]}")
    }

    println("Your pets Are using object")
    for (pet in listOfPets) {
        println("Pet: $pet")
    }

    if(listOfPets.contains("cat")){
        println("Your cat requires special care")
    }
}