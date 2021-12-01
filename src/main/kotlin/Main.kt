import java.util.*

fun main(args: Array<String>) {

    //conditionals
    val userIsLoggedIn = false
    val username = "John"
    val email = "john@gmail.com"

        //basic if statement
    if(userIsLoggedIn){
        println("user is logged in")

    }else if((username == "John") && (email == ".com")){
        //multiple conditions
        println("username and password is correct")
    }else{
        println("The last part is executed")
    }

    //IF statements that return a value
    var message: String = if(username == "John" && email == "john@gmail.com"){
        "ok"
    }else{
       "incorrect"
    }

    //print(message)

    //ranges
    val score = 70
    //array of scores
    val scores = arrayOf(10,34,23,67,89,23,45)

    if(score in scores){
        println("pass")
    }else{
        println("failed")
    }

    //when statements

    var name = "eric"
    val names = arrayOf("john", "eric", "dennis", "james")

    var x = when (name) {
        "erick" -> {
            "Name is eric"
        }
        "jane" -> "Name is jane"

        in names -> "Name is in the array"

        else -> "invalid"
    }
    println(x)

    //for loops
    //use 2 dots(..) / until / downto
    //step method to skip values
    for (i in 0 until 10 step 2) {
        println(i)
    }
    //for loop with element only
    for (name in names){
        println("Mr. $name")
    }
    //for loop with index and element
    for((position, name) in names.withIndex()){
        println("Name at position $position is $name")
    }

    //for loop with index only
    for(position in names.indices){
        println("Name at position $position is ${names[position]}")
    }

    println("========================================================================")
    //while loop
    var age = arrayOf(1,3,6,8,9)
    var counter = 0

    while (counter < age.size){
        println("${age[counter]}")
        counter++
    }
//
//    do{
//        println("${age[counter]}")
//        counter++
//    }while (counter < age.size)

    //repeat loops
    repeat(3) {
        println("hello $it")
    }

    //collections
    //mutable and immutable lists
    val students = mutableListOf<String>("Kelvin", "Jose", "Kim")
    students.add("john")
    println(students)

    //arrays
    var mixedArrays = arrayOf("hi", 23, 0.34, 'd')
    var intArr = arrayOf(2,3,4,5)
    mixedArrays[1] = 10
    var value = mixedArrays[0]

    var combined = intArr + age
    println(combined.contentToString())

    val books: Int?
    books = 6

    books.dec()
}