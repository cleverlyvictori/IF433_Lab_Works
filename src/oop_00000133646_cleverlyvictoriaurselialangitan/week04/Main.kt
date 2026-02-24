package oop_00000133646_cleverlyvictoriaurselialangitan.week04

fun main(){
    println("--- Testing Car ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val tesla = ElectricCar("Tesla", 4, 85)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println("\n--- Employee Hierarchy Test ---")

    val manager = Manager("Budi", 10_000_000)
    val developer = Developer("Andi", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}