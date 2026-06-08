package Lecture.Lat

fun Member.printProfile() {

    println("\n===== MEMBER PROFILE =====")

    println("Name : $name")
    println("Phone : $phone")

    email?.let {
        println("Email : $it")
    } ?: println(
        "Email : Not Available"
    )
}