package oop_00000133646_cleverlyvictoriaurselialangitan.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}