fun main(args: Array<String>) {
    val siswa1 = classified()
    siswa1.nilai = 0.9
    print("Nilai siswa 1 = ")
    println(siswa1.nilai)

    val siswa2 = classified()
    siswa2.nilai = 0.2
    print("Nilai siswa 2 = ")
    println(siswa2.nilai)

    val siswa3 = classified()
    siswa3.nilai = 0.5
    print("Nilai siswa 3 = ")
    println(siswa3.nilai)
}

class classified {
    var nilai: Double = 0.0
        get() = field
        set(value) {
            field = if (value * 10 >= 5)
                1.0
            else
                0.0
        }
}