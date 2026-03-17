package oop_00000133646_cleverlyvictoriaurselialangitan.week07

fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.MonsterEncounter -> { "Monster muncul: ${event.monsterName}! Bersiaplah!" }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            "Mendapat loot: $name (DMG: $damage, Rarity: $rarity)"
        }

        is BattleState.GameOver -> {"Game Over! Alasan: ${event.reason}" }
        BattleState.SafeZone -> { "Anda berada di Safe Zone. Aman..." }
    }

    println(message)
}