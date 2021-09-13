fun main() {

    // membuat objek kucing
    val kucing = Cat("Mengmeng", 4, "Hair", "Meow")
    kucing.walk()
    kucing.sounds(kucing.name, kucing.sound)

    // membuat objek burung
    val burung = Bird("Bondol", 2, "Fur", "Quaks")
    burung.walk()
    burung.sounds(burung.name, burung.sound)
}

// parent class yang nantinya di override pada class child
open class Animal {

    // fun walk akan di override pada class cat dan bird
    open fun walk() {
        println("Every animal has their own way to walk")
    }

    // fun sounds tidak di override pada class child
    open fun sounds(name: String, sound: String) {
        println("$name has $sound")
    }
}

// class child yang akan Override fun walk pada parent class
class Cat(val name: String, private val legs: Int, private val skin: String, val sound: String) :
    Animal() {
    override fun walk() {
        println("$name has $legs legs, and has $skin skin")
    }
}

// class child yang akan  Override fun walk pada parent class
class Bird(val name: String, private val legs: Int, private val skin: String, val sound: String) : Animal() {
    override fun walk() {
        println("$name has $legs legs, and has $skin skin")
    }
}