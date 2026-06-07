package Lecture.Lat

class Repository<T> {
    private val items = mutableListOf<T>()

    fun add(item:T){
        items.add(item)
    }

    fun getAll() = items

    fun showAll() = items.forEach{ println(it) }
}