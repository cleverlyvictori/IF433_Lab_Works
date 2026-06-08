package Lecture.Lat

fun processBooks(
    books:List<LibraryItem>,
    action:(LibraryItem)->Unit
) {
    books.forEach(action)
}