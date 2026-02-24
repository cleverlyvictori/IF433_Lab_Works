package week4

class Knd_motor: Kendaraan() {
    private var jmlBan: Int = 0;
    init {
        jmlBan = 2;
        println("Motor saya $jmlBan ban")
    }
}