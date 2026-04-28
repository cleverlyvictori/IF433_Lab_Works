package Lecture.week10

// non generic
class NonGeneric(var hasil: Any)

// generic
class Generic<T>(var hasil: T)

// gen pro w 2 parameter
class Kota<T, V>(var kodepost: T, var telp: V)

fun <T> cobaFungsi(angka: T): T {
    return angka;
}

//gen pro constrain
fun <T: Number> tambah(angka: T): Double {
    return angka.toDouble() + 50;
}
fun <T: Number> kurang(angka: T): Int {
    return angka.toInt() - 50;
}

//geen
class kalkulator<T: Number>(val a:T, val b:T) {
    fun kali(): Double {
        return a.toDouble() / b.toDouble()
    }
    fun bagi(): Int {
        return a.toInt() / b.toInt()
    }
}

//where clause
fun <T> nilaiKKM(list: List<T>, kkm:T): List<T> where T: Comparable<T> {
    return list.filter { it >= kkm }
}

fun main() {
    println("===== Gen WHERE ====")
    val nilaiMhs = listOf(80, 90, 75, 65, 58,41, 63,83, 61)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, 75);
    println(nilaiMhs);
    print(nilaiFilterKKM);

    println("\n===== gen func in class ====")
    val kalk = kalkulator(10.2, 3.5);
    println("hasil kali: ${kalk.kali()}");
    println("hasil bagi: ${kalk.bagi()}");

    println("===== constrain ====")
    println("hasil tambah: " + tambah(100.5));
    println("hasil kurang: " + kurang(100.5));

    println("===== Non-Generic ====")
    val nGen = NonGeneric(100)
    val angkaNonGen = nGen.hasil as Int
    println(angkaNonGen + 50)

    println("=== Generic ===")
    val gen = Generic(200)
    println(gen.hasil + 50)

    println("=== Gen 2 Para ===")
    val city = Kota("12345", 254313)
    println("kodepos kamu " + city.kodepost)
    println("telp kamu " + city.telp)

    println("=== Gen function ===")
    println("coba fungsi: " + cobaFungsi(10))
}