package Lecture.Lat

class PrintedBook(
    title:String,
    itemCode:String,
    dailyPenalty:Double
) : LibraryItem (title, itemCode, dailyPenalty) {
    override fun calculatePenalty(daysLate: Int): Double {
        return dailyPenalty * daysLate
    }
    override fun printBookDetails() {
        println("BOOK $itemCode - $title")
    }

    override fun toCSV(): String {
        return "$title,$itemCode,$dailyPenalty"
    }
}