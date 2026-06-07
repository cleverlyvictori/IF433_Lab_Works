package Lecture.Lat

abstract class LibraryItem(
    val title:String,
    itemCode:String,
    dailyPenalty:Double
): IBorrowable {

    var itemCode = itemCode
        set(value){
            field = value.uppercase()
        }
        get() = "UMN-LIB-$field"

    var dailyPenalty = 0.0
        set(value){
            if(value >= 0)
                field = value
            else
                println(
                    "[ERROR] Invalid penalty!"
                )
        }

    init {
        this.itemCode = itemCode
        this.dailyPenalty = dailyPenalty
    }

    abstract fun toCSV():String
}