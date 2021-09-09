// Implementasi sederhana Inheritance
fun main() {
    val budi = dosen("PBO", 12, "Budi", "Dosen Tetap", 30)
    budi.mengajar()

    val andi = mahasiswa("14118957", 3.89, "Andi", "Mahasiswa SI", 21)
    andi.belajar()
}

// class utama
open class civitas(nama: String, jabatan: String, umur: Int) {
    init {
        println("Halo $nama, kamu seorang $jabatan dan berumur $umur")
    }
}

// class turunan dari class utama
class dosen(matkul: String, jamAjar: Int, nama: String, jabatan: String, umur: Int) : civitas(nama, jabatan, umur) {
    var nama = nama
    var matkul = matkul
    var jamAjar = jamAjar
    fun mengajar() {
        println("$nama mengajar $matkul, selama $jamAjar")
    }
}

// class turunan dari class utama
class mahasiswa(npm: String, ipk: Double, nama: String, jabatan: String, umur: Int) : civitas(nama, jabatan, umur) {
    var nama = nama
    var npm = npm
    var ipk = ipk
    fun belajar() {
        println("$npm adalah NPM $nama, dan IPK $nama = $ipk")
    }
}