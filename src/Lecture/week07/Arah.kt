package Lecture.week07

enum class Arah(val petunjuk: String) {
    Atas("naik"),
    Bawah("turun"),
    Kiri("belok"),
    Kanan("mengsong");

    fun tampilkan_isi_param(){
        println("arah ke $petunjuk");
    }
}