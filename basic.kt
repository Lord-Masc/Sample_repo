fun main(args: Array<String>) {
    println("hii kotlin")

    // Array in kotlin
    //-> arrayOf type
    val name = arrayOf("yash","verma")
    println(name.contentDeepToString())  // make file readable

    //->constructor
    val name1 = Array(5,{i->i*2})
    println(name1.contentDeepToString())  // make file readable

    
}