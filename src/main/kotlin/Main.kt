fun main(args: Array<String>) {
    //conditionals
    val userIsLoggedIn = false
    val username = "John"
    val email = "john@gmail.com"

    if(userIsLoggedIn){
        println("user is logged in")
    }else if(username == "John"){
        println("username is correct")
    }else{
        println("The last part is executed")
    }
}