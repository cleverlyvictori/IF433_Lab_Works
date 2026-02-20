package oop_00000133646_cleverlyvictoriaurselialangitan.week03

class Weapon(val name: String, damage: Int) {

    var damage: Int = damage
        set(value) {
            if (value < 0) {
                println("Warning: Damage tidak boleh negatif!")
            }
            else if (value > 1000) {
                field = 1000
            }
            else {
                field = value
            }
        }

    val tier:String
        get() {
            if (damage > 800) return "Legendary"
            if (damage > 500) return "Epic"
            return "Common"
        }
}

fun main() {
    val sword = Weapon("Sniper", 300)
    sword.damage = -50
    sword.damage = 9999
    println("Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")
}