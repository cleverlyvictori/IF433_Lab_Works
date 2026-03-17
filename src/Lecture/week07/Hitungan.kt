package Lecture.week07

class Hitungan private constructor(val tipe: String) {
    init{
        println("Ini param class: ${tipe}")
    }

    companion object {
        const val namaMtk = "Matematika"

        fun tambah(a: Int, b: Int) {
            println("Hasil penambahan: " + (a+b));
        }
        fun kali(a: Int, b: Int) {
            println("Hasil perkalian: " + (a*b));
        }
        fun buat_data(tipeUser: String) {
            Hitungan(tipeUser);
        }
    }
}