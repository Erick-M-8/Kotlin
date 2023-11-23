package Clases

class Vehiculo(val marca: String, val modelo: String, val color: String) {
    var placas = ""
    var encendido = "Apagado"
    var gasolina = 0f

    fun Encender() {
        encendido = "Encencdido"
    }

    fun Apagar() {
        encendido = "Apagado"
    }

    fun Recargar_Gasolina(litros_cargados: Float) {
        gasolina += litros_cargados
    }

    init {
        println("\nSe ha creado un objeto car con los datos:\n* Marca: $marca\n* Modelo: $modelo\n* Color: $color")
    }

    constructor(marca: String, modelo: String, color: String, placas: String): this(marca,modelo,color){
        this.placas = placas
        println("Las placas son: ${this.placas}")
    }
}



