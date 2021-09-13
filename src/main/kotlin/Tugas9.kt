// OuterClass
class Vehicle {
    // Using companion to greeting
    companion object {
        const val greeting = "Every vehicle is unique "
        fun greet() {
            println("and also has different fuel capacity")
        }
    }

    // Using inner class inside vehicle class
    inner class Car(private val name: String) {
        private val wheel = 4
        private val seats = 4
        fun fact() {
            println("$name is a car, it has $wheel wheel and $seats seats")
        }

        fun fuelCapacity() {
            println("$name has 20L Fuel Capacity")
        }
    }

    // Using inner class inside vehicle class
    inner class Motorcycle(private val name: String) {
        private val wheel = 2
        private val seats = 2
        fun fact() {
            println("$name is a motorcycle, it has $wheel wheel and $seats seats")
        }

        fun fuelCapacity() {
            println("$name has 5L Fuel Capacity")
        }
    }
}

fun main() {
    // print companion object from outer class
    print(Vehicle.greeting)
    println(Vehicle.greet())

    // making object from car inner class
    val toyota = Vehicle().Car("Toyota")
    toyota.fact()
    toyota.fuelCapacity()

    // making object from motorcycle inner class
    val honda = Vehicle().Motorcycle("Honda")
    honda.fact()
    honda.fuelCapacity()
}

