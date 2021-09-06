fun main(args: Array<String>) {
    val arr = arrayListOf(
        12, 32, 23, 42, 34, 63, 39, 36, 85, 73, 90,
        23, 63, 34, 72, 89, 10, 93, 62, 82, 43, 62,
        48, 49, 30, 86, 63, 62, 39, 92, 37, 67, 98,
        20, 17, 97, 83, 73, 11, 23, 29, 53, 67, 41,
    )
    println(sort(arr))
    print(calculate(arr))
}

fun sort(x: ArrayList<Int>): ArrayList<Int> {
    var n = 0
    while (n < x.size) {
        for (p in x.indices) {
            if (x[n] < x[p]) {
                x[n] += x[p]
                x[p] = x[n] - x[p]
                x[n] -= x[p]
            }
        }
        n++
    }
    return x
}

fun calculate(x: ArrayList<Int>): String {
    var numEven = 0
    var numOdd = 0
    var sum = 0
    val sumAll = { a: Int, b: Int -> a + b }
    for (n in x) {
        if (n % 2 == 0) numEven += 1 else numOdd += 1
        sum = sumAll(sum, n)
    }
    return "Even : $numEven Odd = $numOdd, Total = $sum"
}
