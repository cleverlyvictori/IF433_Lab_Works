package Lecture.week11

fun String.DasarExtention() : String {
    return "halo $this"
}

fun String.UbahHurufBesar(): String {
    var hasil = "";
    hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercaseChar()
        }
    }
    return hasil;
}

fun String.tentukanKelulusan(nilai: Int): String {
    var hasil = "";
    if(nilai > 70) {
        hasil = "lulus"
    } else {
        hasil = "remedial"
    }
    return this + " " + hasil;
}

fun String?.CekNulldanEmpty(): String {
    var hasil = "";
    if(this == null || this.isEmpty()) {
        hasil= "Ga boleh null"
    }else{
        hasil = "password kamu: $this"
    }
    return hasil;
}
data class Manusia(var nama:String, var umur:Int)

//class Manusia(){
  //  var nama: String = ""
    //var umur: Int = 0
//}

fun main() {
    println("grade kamu: ".tentukanKelulusan(71))

    println("ya".repeat(10))

    println("wirawan".DasarExtention())
    //println("wirawan".DasarExtention())

    //wo ext fun
    val nama1 = "budi luhur"
    println(nama1.uppercase());

    println("budi udin".UbahHurufBesar())

    var passwordKamu: String? = "123456"
    println(passwordKamu.CekNulldanEmpty())

    val huruf:String = "UMN";
    val hasilKampus = huruf.let {
        if(it == "umn") {
            "kampus saya"
        }else{
            "bukan kampus saya"
        }
    }
    println(hasilKampus)

    var nilaiKamu = 70.run {
        if (this >= 70) {
            println("lulus")
        }else {
            println("gagal")
        }
    }

    val pekerjaan = with("mahasiswa") {
        if (this=="mahasiswa") {
            println("belajar")
        }else{
            println("pekerja")
        }
    }
    val orang = Manusia("budi", 25).apply{
        umur = 27
    }
    println("nama kamu ${orang.nama} umur kamu ${orang.umur}")

    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also {
        println("sebelum $deretAngka")
    }.add(5)
    println("setelah $deretAngka")

}