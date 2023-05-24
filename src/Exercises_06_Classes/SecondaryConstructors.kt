package Exercises_06_Classes

import jdk.jshell.PersistentSnippet
import java.awt.datatransfer.ClipboardOwner


class Person(
    val first_name: String,
    val last_name: String,
    var age: Int,
    val pets: MutableList<Pet> = mutableListOf()
)

class Pet {
    constructor(owner: Person){
        owner.pets.add(this)
    }
}


fun main(args: Array<String>){

    val person_001 = Person("Lucas", "Motta", 19)


    val pet: Pet = Pet(owner = person_001)

    println(person_001.pets)
    println(pet)
}