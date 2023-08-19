

fun main(){
     /*
     -get user input for a number
     -if that number is:
        -between 0-18, return a text saying that person is a child
        -between 18-65, return a text saying that person is an adult
        ->100, return a text saying that person is an older adult
     -check for null and invalid ages
      */
    while(true) {
        println("Please enter your age:")
        val age = readlnOrNull()?.toIntOrNull()

        checkAge(age)
    }
}

fun checkAge(age: Int?) {
    if (age != null) {
        if (age < 0 || age > 110)
            println("Please provide a value within a valid age range")
        else if (age in 1..17)
            println("You are a child!")
        else if (age in 18..64)
            println("You are an adult!")
        else if (age >= 65)
            println("You are an older adult!")
    }
    else{
        println("Please provide a valid age")
    }
}

