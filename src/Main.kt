fun sum(a: Int, b: Int) : Int {
    return a + b
}

//or

//fun sum(a: Int, b: Int) = a + b


fun printSum(a: Int, b: Int){
    println("Sum $a and $b is ${a + b}!")
}

fun main(){
    val x : Int = 5
    val y : Int = 10
    var z : Int = 20

    z = 10

    print("The sum of 5 and 6 is ")
    println(sum(5, 6))

    printSum(10, 20)
}

