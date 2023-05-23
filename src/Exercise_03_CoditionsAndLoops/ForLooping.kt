package Exercise_03_CoditionsAndLoops

fun main(){

//    val items = Array(5){i -> (i * 3)}
//
//    for (item: Int in items) println(item)
//
//    println("___________________")
//
//    for (i in 1..10){
//        println(i)
//    }
//
//    println("_____________________")
//
//    for (i in 6 downTo  0 step 2) {
//        println(i)
//    }
//
//    loop@ for (i in 1..100){
//        for ( j in 1..100){
//            if (j == 15){
//                break@loop
//            }
//        }
//    }

    val students = listOf("Lucas", "Matheus", "João", "Carla")

    for ((idx, value) in students.withIndex()){
        println("${idx+1} = $value")
    }

}