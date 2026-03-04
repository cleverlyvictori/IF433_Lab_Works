package oop_00000133646_cleverlyvictoriaurselialangitan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}