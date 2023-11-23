package clases

class Goomba(name: String, strength: Int): Enemy(name,strength) { //Goomba heredará las propiedades y métodos de Enemy.
    init {
        println("Iniciando subclase de $name")
    }
}