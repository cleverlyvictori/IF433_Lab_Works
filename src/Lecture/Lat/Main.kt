package Lecture.Lat

import java.util.Scanner

fun main() {

    val scanner =
        Scanner(System.`in`)

    println(
        "=== UMN DIGITAL LIBRARY ==="
    )

    val book1 =
        PrintedBook(
            "Kotlin Programming",
            "kt01",
            -5000.0
        )

    book1.dailyPenalty =
        3000.0

    println(
        "[Database Setup] Penalty updated to Rp ${book1.dailyPenalty}"
    )

    val book2 =
        PrintedBook(
            "Data Structure",
            "ds01",
            4000.0
        )

    val book3 =
        EBook(
            "Machine Learning",
            "ml01",
            5000.0,
            true
        )

    val repository =
        Repository<LibraryItem>()

    repository.add(book1)
    repository.add(book2)
    repository.add(book3)

    println(
        "\n--- MEMBER REGISTRATION ---"
    )

    print("Member Name : ")
    val name =
        scanner.nextLine()

    print("Phone Number : ")
    val phone =
        scanner.nextLine()

    print("Email : ")
    val email =
        scanner.nextLine()

    val member =
        Member(
            name,
            phone,
            email.ifBlank {
                null
            }
        )

    member.printProfile()

    val borrowManager =
        BorrowManager(member)

    var choice: Int

    do {

        println(
            "\n--- BOOK CATALOG ---"
        )

        repository.getAll()
            .forEachIndexed { index, book ->

                println(
                    "${index + 1}. ${book.title}"
                )
            }

        println("0. FINISH BORROWING")

        print("Choose Book : ")

        choice =
            scanner.nextInt()

        if (
            choice in 1..repository
                .getAll()
                .size
        ) {

            try {

                print(
                    "Input Late Days : "
                )

                val daysLate =
                    scanner.nextInt()

                if (daysLate < 0) {

                    throw InvalidBorrowDayException(
                        "Late days cannot be negative!"
                    )
                }

                borrowManager.borrowItem(
                    repository.getAll()[choice - 1],
                    daysLate
                )

            } catch (
                e: InvalidBorrowDayException
            ) {

                println(
                    e.message
                )

            } finally {

                println(
                    "Validation Finished"
                )
            }
        }

    } while (choice != 0)

    println(
        "\n=== BOOKS WITH PENALTY > 3500 ==="
    )

    repository.getAll()
        .filter {
            it.dailyPenalty > 3500
        }
        .forEach {
            println(it.title)
        }

    println(
        "\n=== SORTED BOOKS ==="
    )

    repository.getAll()
        .sortedBy {
            it.title
        }
        .forEach {
            println(it.title)
        }

    println(
        "\n=== ALL BOOKS ==="
    )

    repository.getAll()
        .forEach {
            println(it.title)
        }

    println(
        "\n=== HIGHER ORDER FUNCTION ==="
    )

    processBooks(
        repository.getAll()
    ) {

        println(it.title)
    }

    FileManager.saveBooks(
        repository.getAll()
    )

    FileManager.loadBooks()

    borrowManager.status =
        BorrowStatus.BORROWED

    borrowManager.printReport()
}