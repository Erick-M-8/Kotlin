package clases

class Koopa(name:String, strength:Int):Enemy(name,strength){
    protected var state = "Without shell"
/*  Override: se utiliza para indicar que una subclase está proporcionando una implementación
    específica de un método que ya está definido en una superclase.
    Para que un método en la clase ueda ser sobreescrito se debe anteponer
    la palabra open a el metodo de la superclase    */

    override fun collisionEnemy(collision: String){
        super.collisionEnemy(collision) //Algoritmo de la superclase
        println("(Usando collision de la clase enemy)")
        //Complemento
        when(collision){
            "Weapon"->{
                state = "Shell"
                println("El estado del Koopa ahora es: $state")
                println("(Usando la entension del metodo)")
            }
            //Se observa como la clase hija hereda los metodos de la clase padre
            "Enemy" -> changeDirection()
        }
    }
}