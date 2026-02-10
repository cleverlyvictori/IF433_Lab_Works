package oop_00000133646_cleverlyvictoriaurselialangitan.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine() =
        if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- DETAIL PEMINJAMAN ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 1) duration = 1

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")
}