package Lecture

fun pembagian() {
    try {
        val a = 10;
        val b = 2;
        val hasil = a / b;
        println("hasil bagi $hasil")
    } catch (e: Exception) {
        println("ada eror " + e.message)
    } finally {
        println("selesai try catch")
    }
}

fun cek_tipe_variable(){
    var angka: Int = try {
        Integer.parseInt("123")
    } catch (e: Exception){
        println("ada eeror ${e.message}");
        -77
    }
    println(angka);
}

fun cekNilai(nilai: Int){
    if(nilai < 0){
        throw IllegalArgumentException("masa nilai minus")
    } else if (nilai > 100){
        throw IllegalArgumentException("nilai ga boleh lebih dari 100")
    } else {
        println("nilai kamu adalah " + nilai);
    }
}

class cek_saldoRekening(val pengeluaran: Int, val saldo: Int): Exception("Saldo kamu sisa $saldo, gak cukup buat belanja $pengeluaran");

class transaksi(val belanja:Int) {
    fun narikUang(balance: Int){
        if (belanja > balance) {
            throw cek_saldoRekening(belanja, balance);
        } else {
            println("transaksi berhasil, sisa saldo ${balance - belanja}");
        }
    }
}

fun multipleCatch( input: String){
    try {
        val angka:Int = input.toInt();
        val hitungBagi: Int = angka/0;
        println(" hasil bagi $hitungBagi");
    } catch (e: ArithmeticException) {
       println("masa pembagian ada 0 : ${e.message}");
    } catch (e: Exception) {
        println("ada error di multiple ${e.message}");
    }
}

sealed class BankException(pesan: String): Exception("Error di bank exception $pesan");

class cekSaldo(val pengeluaran: Int): BankException("Belanja $pengeluaran lebih besar dari saldo");
class cekInput(val transaksi: Int): BankException("Transaksi masa minus $transaksi");

fun transaksiBelanja(saldoKamu: Int, jajan: Int): Int {
    if (jajan<0){
        throw cekInput(jajan);
    } else if (saldoKamu < jajan) {
        throw cekSaldo(jajan);
    }
    return saldoKamu - jajan;
}

fun main() {
    runCatching { transaksiBelanja(1000, 1200) }
        .onSuccess { println("belanja berhasil, sisa saldo $it") }
        .onFailure { println(it) }

    multipleCatch("123")
    pembagian();
    cek_tipe_variable();
    try {
        cekNilai(-10);
    } catch (e: Exception){
        println("ada error di nilai " + e.message)
    }
    val transaksi = transaksi(1000);
    transaksi.narikUang(1200);
}

