package Exercise_02_Types

import java.util.Scanner

fun main(){

    val arrayName = arrayOf(1, 2, 3, 4, 5)
    for (item in arrayName.indices){
        println(item)
    }

    val otherArray = arrayOf("a", 1)
    for (item in otherArray){
        println(item)
    }

    println("---------------")
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
    println("---------------")

    val other = Array(10) { i -> ("a")}
    other.forEach { println(it) }


}