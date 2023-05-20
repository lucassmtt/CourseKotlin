package Exercise_03_CoditionsAndLoops

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)
    print("Send the value: ")
    val firstValue = input.nextInt()
    print("Send the seccond value: ")
    val seccondValue = input.nextInt()

    if (firstValue > seccondValue){
        println("First value is bigger than the seccond!")
    }

    else if (firstValue == seccondValue){
        println("The values is equal!")
    }

    else {
        println("The second value is bigger!")
    }
}