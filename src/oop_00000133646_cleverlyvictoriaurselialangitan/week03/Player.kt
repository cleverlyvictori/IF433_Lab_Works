package oop_00000133646_cleverlyvictoriaurselialangitan.week03

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}

fun main() {
    val sword = Weapon("Sniper", 300)
    val player = Player("Rizky")
    sword.damage = -50
    sword.damage = 9999

    println("Weapon: ${sword.name}")
    println("Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    player.addXp(50)
    player.addXp(60)
}