package Clases

import Interfaces.IPromotion

open class National(override val city: String) : Travel() { //Implementar miembros de la clase abstracta
    override val country = "Mexico"
    //Map de los diferentes precios dependiendo la ciudad
    private val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajajara" to 350,
        "CDMX" to 360,
        "San Cristobal" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city] //obtenemos la tarifa según la ciudad
        return if(fee== null) 0 else fee*numDays
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if(price == 0){
            println("No hacemos viaje a esta ciudad")
        }else
            println("Tu viaje a $city cuesta \$$price")
    }
}