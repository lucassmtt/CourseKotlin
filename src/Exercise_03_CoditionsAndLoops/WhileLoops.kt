package Exercise_03_CoditionsAndLoops

fun main(){

//    var x: Int = 10;
//
//    while (x > 0){
//
//        println("The x value is $x")
//        x --
//    }

    var option: Int = 0

    do {
        print("Please, send one value: ")
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0
        println("You sent the value $option!! ")
    }
    while(option != -1)

}