/*Set (Conjunto):
--Un conjunto es una colección de elementos únicos, lo que significa que no permite elementos duplicados.
--Los elementos en un conjunto no están ordenados, lo que significa que no puedes confiar en ningún orden
  específico al recorrerlos.
--Se utiliza cuando deseas almacenar elementos sin duplicados y no te importa el orden en que se almacenan.
*/
fun main(){
    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)
    if(numSet == reverseNumSet){
        println("Ambos set son iguales porque no importa el orden")
    }
    //creamos un set mutable
    var names: Set<String> = mutableSetOf("Nombre 1","Nombre 2")

    /*Map:En Kotlin, un mapa (Map) es una colección de datos que almacena pares de clave-valor. Cada elemento
    en un mapa está asociado con una clave única que se utiliza para recuperar el valor correspondiente.*/

    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 23)
    println(namesToAges["user_one"])
}

