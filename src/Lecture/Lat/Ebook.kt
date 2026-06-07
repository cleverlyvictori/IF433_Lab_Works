package Lecture.Lat

class EBook(
    title:String,
    itemCode:String,
    dailyPenalty:Double,
    var isPremium:Boolean
): LibraryItem(
    title,
    itemCode,
    dailyPenalty
){

    override fun calculatePenalty(
        daysLate:Int
    ):Double {

        val penalty =
            if(isPremium)
                dailyPenalty + 2000
            else
                dailyPenalty

        return penalty * daysLate
    }

    override fun printBookDetails() {

        println(
            "[EBOOK] $itemCode - $title"
        )
    }

    override fun toCSV():String {

        return "$itemCode,$title,$dailyPenalty"
    }
}