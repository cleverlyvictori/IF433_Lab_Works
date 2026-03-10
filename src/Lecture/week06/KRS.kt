package Lecture.week06

class KRS(override val nama: String, override val namaSiswa: String):  Mahasiswa, Siswa {
    override fun belajar() {
        println("si $nama sedang belajar")
        println("Siswa $namaSiswa sedang belajar juga")
        super<Siswa>.main_game()
    }
    override fun main_game() {
        super<Mahasiswa>.main_game()
    }

    override fun makan() {
       println("Mahasiswa makan")
    }
    override fun mandi(){
        println("Mahasiswa mandi")
    }
}