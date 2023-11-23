package clases

import java.util.*
import kotlin.concurrent.schedule


class Mario(private var lives: Int = 3) { // Definir la clase Mario con un atributo privado "lives" ,inicializado en 3
    init {
        println("It's a me! Mario!")    //Vamos a hacer que Mario se presente al construir
        //die() //Observe como esta funcion, por ser privada solo es accesible desde esta clase
    }

    private var state = "small"     //Mario es pequeño al iniciar el juego
    // Setter de la propiedad "state": se ejecuta cuando intentas cambiar el valor de la propiedad "state" mediante la función collision

        set(value) {                  // Value es el nuevo valor que se está tratando de asignar a "state".
            val before = field        // Se guarda el valor actual de "field" en la variable "before".
            field = value             // Asigna este nuevo valor a la variable de respaldo llamada "field"
            println("El estado de mario ahora es $field")        // Imprime el nuevo valor de "field"
            if (value == "Star") {
            //Timer("SettingUp", false).schedule(10000) {
                    field = before  // Restaura el valor anterior a "field" después de 10 segundos
                    println("El estado de mario ahora es $field") // Imprime el valor restaurado de "field"
            //  }
            }
        }

    private var lives2 = lives //la varible lives 2 sera la que tome el valor de lives = 3 asignado por default en el constructor
        //Setter de la propiedad lives2
        set(value) {
            if (field == 1) { //Si la vida queda en uno y se pierde una mas
                field = 0
                gameOver() // se imprime el mensaje game over
            } else if (field == 0) {
                println("Necesitas volver a jugar")
            } else {
                field = value
            }
        }
    //verificar que mario siga vivo. cuando no quedan vidas (lives2) se envia un false
    val isAlive: Boolean
        //Getter para funcion privada lives2
        get(){
            return lives2 >=1
        }

    //Resta una vida al jugador
    private fun die() {
        lives2--
        println("Has perdido una vida!")
    }

    //La funciòn collision recibe un argumento de tipo string y en funciòn de ese argumento toma acciones
    fun collision(collisionObj: String) {
        when (collisionObj) { //switch
            "Goomba" -> lives2--
            "Super Mushroom" -> state = "Super Mario"
            "Fire flower" -> state = "Fire Mario"
            "Star" -> state = "Star"
            else -> println("Objeto desconocido, ¡No pasa nada!")
        }
    }

    //Getter de la variable privada lives
    fun getLives(): String {
        return "$lives2 vidas"
    }

    private fun gameOver() {
        println("Juego Terminado")
    }
}