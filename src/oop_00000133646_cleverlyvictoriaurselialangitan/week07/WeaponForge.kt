package oop_00000133646_cleverlyvictoriaurselialangitan.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {

        fun forgeStarterSword(): Weapon {
            val item = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem(
                name = "Pedang Naga Legendaris",
                damage = 100,
                rarity = ItemRarity.EPIC
            )
            return Weapon(item, 200)
        }
    }
}