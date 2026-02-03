package oop_00000133646_cleverlyvictoriaurselialangitan.week01


fun main() {
    val gameTitle = "Ucup Menjelajahi Nusantara"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 20 / 100 else price * 10 / 100
