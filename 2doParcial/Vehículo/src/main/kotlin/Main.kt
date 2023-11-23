import Clases.Vehiculo
import Clases.Phone

fun main() {
    /*val myPhone = Phone()
    myPhone.ComprobarEstado()
    myPhone.Encender()
    myPhone.ComprobarEstado()
    myPhone.Apagar()
    myPhone.ComprobarEstado()*/

    val myCar = Vehiculo("Ford","Focus","Black")
    myCar.placas = "CMD-1321"
    println("El estado del carro es: ${myCar.encendido}")
    myCar.Encender()
    println("El estado del carro es: ${myCar.encendido}")
    myCar.Apagar()
    println("El estado del carro es: ${myCar.encendido}")
    println("Los datos del coche son:\n* Marca: ${myCar.marca}\n* Modelo: ${myCar.modelo}\n* Color: ${myCar.color}")
    println("Litros de gasoslina disponibles: ${myCar.gasolina}")
    myCar.Recargar_Gasolina(3.5f)
    println("Litros de gasoslina disponibles: ${myCar.gasolina}")
}