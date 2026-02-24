package oop_00000133646_cleverlyvictoriaurselialangitan.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}