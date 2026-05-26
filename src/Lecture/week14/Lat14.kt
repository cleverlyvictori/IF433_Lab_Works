package Lecture.week14

class proses_khs {

    fun hitung_nilai_tugas(
        quiz: Double,
        aktivitas: Double
    ): Double {
        return quiz * 0.3 + aktivitas * 0.7
    }

    fun hitungNilaiAkhir(
        utsMhs: Double,
        uasMhs: Double,
        tugasMhs: Double,
        jesKur: jenis_kurikulum
    ): Double {

        return jesKur.hitungNilaiBobot(
            utsMhs,
            uasMhs,
            tugasMhs
        )
    }
}

interface jenis_kurikulum {
    fun hitungNilaiBobot(
        uts: Double,
        uas: Double,
        tugas: Double
    ): Double
}

class kur2013 : jenis_kurikulum {

    override fun hitungNilaiBobot(
        uts: Double,
        uas: Double,
        tugas: Double
    ): Double {

        return (uts * 0.3) +
                (uas * 0.4) +
                (tugas * 0.3)
    }
}

class kurMerdeka : jenis_kurikulum {

    override fun hitungNilaiBobot(
        uts: Double,
        uas: Double,
        tugas: Double
    ): Double {

        return (uts * 0.3) +
                (uas * 0.4) +
                (tugas * 0.3)
    }
}

class dbMhs {

    fun simpanNAdb(
        nim: String,
        nama: String,
        nilaiAkhir: Double
    ): String {

        return "KRS $nim nama $nama dapat nilai akhir $nilaiAkhir"
    }

    fun loadDB(nim: String): String {
        return "Berhasil load data $nim"
    }
}

class manajerHitungKhs {

    fun mulaiPerhitungan(
        quizTugas: Double,
        aktivitasTugas: Double,
        utsKamu: Double,
        uasKamu: Double,
        jesKur: jenis_kurikulum
    ): Double {

        val khsMhs = proses_khs()

        val nilaiTugas =
            khsMhs.hitung_nilai_tugas(
                quizTugas,
                aktivitasTugas
            )

        val naMhs =
            khsMhs.hitungNilaiAkhir(
                utsKamu,
                uasKamu,
                nilaiTugas,
                jesKur
            )

        return naMhs
    }
}

class manajerDb {

    fun mulaiSimpan(
        nimMhs: String,
        namaMhs: String,
        naMhs: Double
    ): String {

        val db_mhs = dbMhs()

        return db_mhs.simpanNAdb(
            nimMhs,
            namaMhs,
            naMhs
        )
    }
}

fun main() {

    val manajerKhs = manajerHitungKhs()

    val naMhs1 =
        manajerKhs.mulaiPerhitungan(
            88.45,
            74.56,
            89.21,
            92.3,
            kur2013()
        )

    val naMhs2 =
        manajerKhs.mulaiPerhitungan(
            88.25,
            74.56,
            89.21,
            92.3,
            kurMerdeka()
        )

    val manajerdb = manajerDb()

    println(
        manajerdb.mulaiSimpan(
            "123",
            "ucok",
            naMhs1
        )
    )

    println(manajerdb.mulaiSimpan("124", "budi", naMhs2
        )
    )
}