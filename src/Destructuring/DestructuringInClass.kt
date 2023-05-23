package Destructuring

data class Car(val brand: String, val model: String)


fun main(args: Array<String>) {
    val myCar: Car = Car("Ford", "Fusion")

    val (brand, model) = myCar
    // or
    val (_brand, _model) = Car("Chevrolet", "Onix")

    println("Brand: $brand, Model $model")
    println("Brand: $_brand, Model $_model")
}