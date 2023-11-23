package clases

open class Enemy (val name: String, val strength:Int){
    init {
        println("Iniciando superclase Enemy\n(Se ha creado un enemigo)")
    }
    protected var direction: String = "Left"

    open protected fun changeDirection(){
        direction = if (direction=="Right") "Left" else "Right"
        println("$name va en dirección $direction")
    }
    //Los métodos protected solo pueden ser accedidos por la clase donde son creados y desde clases hijas
    protected fun die(){
        println("$name ha muerto")
    }
    /*Por ello se crea una función a la que puede acceder el main y en función de los mensajes que esta reciba
    cutar determinado metodo*/
    open fun collisionEnemy(collision: String){
        when (collision){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}