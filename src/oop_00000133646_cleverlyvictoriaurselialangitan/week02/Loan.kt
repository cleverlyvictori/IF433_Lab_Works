package oop_00000133646_cleverlyvictoriaurselialangitan.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine() =
        if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
}