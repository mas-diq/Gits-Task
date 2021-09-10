fun main() {
    //kumpulan angka dalam array
    val arr = arrayListOf(
        12, 32, 23, 42, 34, 63, 39, 36, 85, 73, 90,
        23, 63, 34, 72, 89, 10, 93, 62, 82, 43, 62,
        48, 49, 30, 86, 63, 62, 39, 92, 37, 67, 98,
        20, 17, 97, 83, 73, 11, 23, 29, 53, 67, 41,
    )
    /*
    mencetak array yang sudah dijalankan function
    sort dan calculate.
     */
    println(sort(arr))
    print(calculate(arr))
}

//function sort untuk dapat mengurutkan array secara asc
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

/*function calculate untuk menghitung jumlah angka
genap dan ganjil, sekaligus menghitung total semua
angka jika dijumlahkan */
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
