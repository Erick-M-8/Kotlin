package Interfaces

interface IPromotion {
    val discount : Int  //Descuento en porcentaje o en cantidad
    val typeDiscount : Int  //Porcentaje o cantidad

    fun getDiscountPrice(amount:Int):Int{   //Obtener el precio real ya con el descuento
        return if(typeDiscount == 0){   //0 es porcentaje
            (amount*(100-discount))/100
        }else{
            amount-discount //Cantidad específica
        }
    }
}