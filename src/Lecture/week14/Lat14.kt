package Lecture.week14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double): Double {
        return quiz * 0.3 + (aktivitas * 0.7)
    }

    fun hitungNilaiAkhir(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}
class dbMhs {
    fun simpanNAdb(nim: String, nama: String, nilaiAkhir: Double):String{
        return "KRS $nim nama $nama dapat nilai akhir $nilaiAkhir";
    }
    fun loadDB(nim: String): String{
        return "Berhasil load data $nim"
    }
}

fun main() {
    val khsMhs = proses_khs();
    val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(83.57, 76.45);
    val naMhs: Double = khsMhs.hitungNilaiAkhir(85.67, 70.40, nilaiTugas);

    val db_mhs = dbMhs();
    val statSimpan: String = db_mhs.simpanNAdb("123", "Titus", naMhs);
    println(statSimpan);
}
