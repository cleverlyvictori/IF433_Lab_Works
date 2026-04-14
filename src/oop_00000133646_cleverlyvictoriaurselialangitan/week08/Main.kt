package oop_00000133646_cleverlyvictoriaurselialangitan.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")

    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name
        ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}