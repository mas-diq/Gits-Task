import java.util.*

//simple sorting and classified to even or odd numbers

fun main() {
    val s = Scanner(System.`in`)
    print("Input your numbers = ")
    val n: String = s.nextLine()
    val num = n.split(" ").toTypedArray()
    num.sort()
    println("Sorted = " + num.contentToString())
    for (x in num.indices) {
        if (num[x].toInt() % 2 == 0) {
            println(num[x] + " is Even")
        } else {
            println(num[x] + " is Odd")
        }
    }
    s.close()
}