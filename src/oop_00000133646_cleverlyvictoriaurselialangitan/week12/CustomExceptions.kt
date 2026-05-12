package oop_00000133646_cleverlyvictoriaurselialangitan.week12

class InsufficientFundsException(val amount: Double, val balance: Double) :
    Exception("Attempted: $amount, balance: $balance")