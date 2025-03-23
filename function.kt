fun main(args: Array<String>) {
    println("This is main function :- ")

    println("Enter your name :- ")
    // val name1 = readln() // 
    // val n = name1.toInt()
    // in build function
    // println(Math.sqrt(81.0))  
    
    //userdefined function
    name("yash verma" )
}

fun name(n:String = "yash" , age:Int =78){
    println("hii this is $n and age is $age")
}
