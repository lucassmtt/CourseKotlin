package Destructuring

fun main(args: Array<String>){

    val listCars = listOf("Fusion", "Onix", "Marea", "Other Model", "Fusca")

    val (ford, chevrolet, pegeout, _, volkswagen ) = listCars

    print("$ford\n $chevrolet\n $pegeout\n $volkswagen")
}