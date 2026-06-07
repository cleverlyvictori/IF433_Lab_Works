package Lecture.Lat

class BorrowManager(
    val member: Member
) {

    var status: BorrowStatus =
        BorrowStatus.WAITING

    private val borrowedItems =
        mutableListOf<Pair<LibraryItem, Int>>()

    fun borrowItem(
        item: LibraryItem,
        daysLate: Int
    ) {

        borrowedItems.add(
            Pair(item, daysLate)
        )

        println(
            "Borrowing recorded successfully!"
        )
    }

    fun printReport() {

        var totalPenalty = 0.0

        println("\n========== BORROW REPORT ==========")

        println(
            "Member : ${member.name}"
        )

        println(
            "Phone  : ${member.phone}"
        )

        println(
            "Status : $status"
        )

        println("-----------------------------------")

        var no = 1

        for ((item, daysLate) in borrowedItems) {

            val penalty =
                item.calculatePenalty(daysLate)

            println(
                "$no. ${item.title}"
            )

            println(
                "   Late Days : $daysLate"
            )

            println(
                "   Penalty   : Rp $penalty"
            )

            totalPenalty += penalty

            no++
        }

        println("-----------------------------------")

        println(
            "TOTAL PENALTY : Rp $totalPenalty"
        )
    }
}