import Clases.National
import Clases.NationalLowSeason

/*
Interfaces:
*Las clases pueden implementar múltiples interfaces.
*Las interfaces definen un conjunto de métodos que una clase debe implementar.
*No pueden contener implementaciones de métodos; solo declaraciones de métodos.
*Las interfaces se utilizan para establecer un comportamiento común entre clases no relacionadas.

Clases abstractas:
*Una clase pueden implementar solo una clase abstracta.
*Las clases abstractas son clases que no se pueden instanciar directamente.
*Sirven como plantillas para clases concretas.
*Pueden contener tanto métodos abstractos (sin implementación) como métodos concretos (con implementación).
*Las clases derivadas de una clase abstracta deben implementar todos los métodos abstractos de esa clase.
*Las clases abstractas se utilizan para proporcionar una estructura común a un grupo de clases relacionadas.

*/

fun main() {
    //val viajeMonterrey = National("Monterrey")
    val viajeMonterrey = NationalLowSeason("Monterrey")
    viajeMonterrey.reserve(4)
    viajeMonterrey.quotePrice(2)
}