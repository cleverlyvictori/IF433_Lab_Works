package oop_00000133646_cleverlyvictoriaurselialangitan.week03

open class Karyawan {
    private var nama:String = "belum ada ";
    private var gaji:Int = 0;
    protected var namaPacar: String = "jomblo";

    public var umur:Int = 0
        set(value) {
            if (value < 0) {
                println("Masa umur minus");
            }else{
                field = value;
            }
        }

    public fun set_nama(namakamu:String) {
        if (namakamu.length == 0) {
            println("Eh nama kamu ga boleh kosong");
        }else{
            this.nama = namakamu;
        }
    }
    public fun get_nama():String {
        return this.nama + "ok ";
    }

    public fun set_gaji(gajikamu:Int) {
        if (gajikamu <= 0) {
            println("Eh masa gaji kosong");
        }else{
            this.gaji = gajikamu;
        }
    }
    public fun get_gaji():Int {
        return this.gaji;
    }
}

class  DataPribadi: Karyawan() {

    fun ambil_data_pacar():String {
        return this.namaPacar;
    }
}

fun main() {
    var dp = DataPribadi();
    println("Nama Pacar: " + dp.ambil_data_pacar());

    dp.umur = 10;
    println("Nama Karyawan: " + dp.get_nama() + "umur kamu " + dp.umur);

    /*var kry = Karyawan();
    kry.set_nama("Ucok Sitorus");
    kry.set_gaji(-100);
    println("hai " + kry.get_nama() + "Gaji kamu: " + kry.get_gaji());*/
}
