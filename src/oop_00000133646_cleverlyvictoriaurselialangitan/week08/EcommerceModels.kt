package oop_00000133646_cleverlyvictoriaurselialangitan.week08

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()
data class Clothing(val id: String, val name: String, val size: String) : Product()