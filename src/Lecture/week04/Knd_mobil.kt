package Lecture.week04

class Knd_mobil: Kendaraan() {
    private var jmlBan: Int = 0;

    init {
        jmlBan = 4;
        println("Mobil punya $jmlBan ban");
        super.jalan_maju();
    }

    override fun jalan_maju() {
        println("mobil majuuu")
    }
}