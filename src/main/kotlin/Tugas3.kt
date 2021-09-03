import java.util.*

fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    print("Input some numbers that separate with 1 space except 67 = ")
    val num = s.nextLine()
    val n = num.split(" ").toTypedArray()

    one@ for (i in n.indices) when {
        n[i].toInt() % 2 == 0 -> {
            print("$i.")
            multipleTwo()
        }
        n[i].toInt() % 3 == 0 -> {
            print("$i.")
            multipleThree()
        }
        n[i].toInt() % 5 == 0 -> {
            print("$i.")
            multipleFive()
        }
        n[i].toInt() % 67 == 0 -> {
            println("$i. This is the end")
            break
        }
        else -> {
            println("$i. This is continue")
            continue
        }
    }
}

fun multipleTwo() = print("Halo ")
fun multipleThree() = print("Hai ")
fun multipleFive() = print("Hola ")
