package Lecture.Lat

interface IBorrowable {
    fun calculatePenalty(daysLate: Int): Double

    fun printBookDetails()
}