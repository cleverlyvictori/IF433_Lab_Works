package Lecture.week09

fun main() {
    println("========== LIST OF ===========")
    var arMhs = listOf("Budi", "Susi", "Titus");

    //view
    println(arMhs);
    println("panjang list ${arMhs.size}")
    println(arMhs[1])
    for (a in arMhs){
        println("mahasiswa bernama: $a")
    }

    println("======= MUTABLE LIST ========");
    var arAngka = mutableListOf(10, 30, 40, 20, 90, 100, 15);
    arAngka.add(777)
    arAngka[2] = 123
    arAngka.removeAt(3)
    println(arAngka)

    println("======= SET OF ========");
    var arUrutan = setOf(20,30,40.50,70,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga"+ arUrutan.contains(40));

    println("======= MUTABLE SET OF ========");
    var arMakanan = mutableSetOf("Nasi", "Bakpao","Mie", "Ayam", "Ayam lagi")
    arMakanan.add("ketoprak")
    arMakanan.remove("Mie")
    arMakanan.add("Mie")
    println(arMakanan)

    println("======= MAP OF ========");
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("Banyak data siswa: " + arSiswa.size)
    println("Nilai si Andi: " + arSiswa["Andi"]);
    println("semua keys: " + arSiswa.keys);
    println("semua values: " + arSiswa.values);
    println("nama siswa index 1: " + arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("======= MUTABLE MAP ========");
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur Asem" to 1500
    )
    println("banyak menu: " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Udang", 2000)
    println(arMenu);

    println("======= LAMBDA ========");
    fun tambah(a:Int, b:Int):Int {
        return a+b;
    }
    var kurang = {a: Int, b: Int -> a-b}
    println("kurang-kurangan: ${kurang(5,3)}");

    println("======= IMPLICATION ========");
    var pangkat = {x: Int ->x*x}
    var hitungPangkat:(Int) -> Int = {it * it}
    println("pangkat " + hitungPangkat(5));

    arSiswa.forEach {
        siswa -> println(siswa)
    }
    for(sis in arSiswa){
        println(sis)
    }
}