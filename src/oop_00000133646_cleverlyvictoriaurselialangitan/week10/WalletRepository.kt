package oop_00000133646_cleverlyvictoriaurselialangitan.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
    fun searchByName(keyword: String): List<T> {
        return items.filter {
            when (it) {
                is Coin -> it.name.contains(keyword, ignoreCase = true)
                else -> false
            }
        }
    }
}