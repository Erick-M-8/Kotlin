package Clases

class Phone {
    //Atributos
    var Estado = false
    lateinit var modelo: String // late init se utiliza para indicar que la variable model será inicializada más tarde

    //Metodos
    fun Encender() {
        Estado = true
    }

    fun Apagar() {
        Estado = false
    }

    fun ComprobarEstado() {
        val Estado_obtenido =
            if (Estado) {
                "encendido"
            } else {
                "apagado"
            }
        println("El estado del teléfono es: $Estado_obtenido")
    }
}