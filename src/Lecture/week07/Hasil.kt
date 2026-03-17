package Lecture.week07

sealed class Hasil {

    data class Sukses(val data: String) : Hasil();
    data class Error(val ex: Exception) : Hasil();
    object Loading : Hasil();

    fun handle_response(res: Hasil) {
        when (res) {
            is Sukses -> { println("Sukses lempar data")}
            is Error -> { println("Pesan Error ${res.ex}")}
            Loading -> { println("Sedang Loading..")}
        }

    }
}