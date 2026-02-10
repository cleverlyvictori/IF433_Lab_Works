package oop_00000133646_cleverlyvictoriaurselialangitan.week02

import java.util.Scanner

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}


fun main() {
    val scanner = Scanner(System.`in`)

    print("Nama Hero: ")
    val name = scanner.nextLine()

    print("Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, baseDamage = damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("Musuh menyerang! Hero terkena $enemyDamage damage")
                println("HP Hero: ${hero.hp}")
            }
        } else {
            println("Hero kabur!")
            break
        }
    }

    if (hero.hp > enemyHp) {
        println("Hero MENANG!")
    } else {
        println("Musuh MENANG!")
    }
}