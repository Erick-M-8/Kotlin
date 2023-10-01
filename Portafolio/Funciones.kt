//😁

import kotlin.math.pow

const val PHI = 1.618f
const val PI = 3.1416f

//Sintaxis de una función
//fun name (arg_received : type) type_return

fun main() {
    val radius =4f //Kotlin asigna el tipo de variable entero por default
    val area = circleArea(radius)
    print("\n")
    println("El área del círculo es: $area") //Recordar string templates

    printName("Erick Montoya")
    printAge(21)
    getPi()
    printPHI()
}

fun circleArea(radius:Float):Float{
    return PI*radius.pow(2)
}

fun printName(name:String){
    println("Mi nombre es $name")
}

fun printAge(Age:Int){
    println("Tengo $Age años de edad")
}

fun getPi():Float{
    return PI;
}

fun printPHI() {
    println("El valor del número aureo es: $PHI")
}