package Lecture.week07

fun main(){
    Koneksi.kon = "http://localhost:1313"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db();

    Hitungan.tambah(10, 20);
    Hitungan.kali(7, 28);
    println("Nama Matkul: ${Hitungan.namaMtk}");
    Hitungan.buat_data("User biasa");

    val dt = SaveData("Mario", 10, 100, 5);
    println("Nama char ${dt.namaChar}");
    println(dt);

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("Nama char ${dtCopy.namaChar}");
    println(dtCopy);

    println("=== class enum ===");
    val arh = Arah.Atas;
    println(arh.tampilkan_isi_param());

    println("=== class sealed ===");
    val hsl: Hasil = Hasil.Sukses("Berhasil disimpan");
    hsl.handle_response(hsl)


}