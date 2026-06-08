package Lecture.Lat

import java.io.File

object FileManager {

    fun saveBooks(
        books: List<LibraryItem>
    ) {

        File("books.txt")
            .printWriter()
            .use { writer ->

                books.forEach {
                    writer.println(
                        it.toCSV()
                    )
                }
            }

        println(
            "Books saved successfully!"
        )
    }

    fun loadBooks() {

        println(
            "\n===== FILE CONTENT ====="
        )

        File("books.txt")
            .readLines()
            .forEach {
                println(it)
            }
    }
}