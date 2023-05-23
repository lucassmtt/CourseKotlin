package Exercise_03_CoditionsAndLoops

import java.util.Scanner

fun main(){

//    val input = Scanner(System.`in`)
//    print("Send the value: ")
//    val firstValue = input.nextInt()
//    print("Send the seccond value: ")
//    val seccondValue = input.nextInt()
//
//    if (firstValue > seccondValue){
//        println("First value is bigger than the seccond!")
//    }
//
//    else if (firstValue == seccondValue){
//        println("The values is equal!")
//    }
//
//    else {
//        println("The second value is bigger!")
//    }

    val number_01: Int = 1;
    val number_02: Int = 2;

    // val biggerValue = if (number_01 > number_02){number_01} else {number_02}

    // or

    val biggerValue = if (number_01 > number_02) number_01 else number_02

    println("The bigger value is $biggerValue")
}