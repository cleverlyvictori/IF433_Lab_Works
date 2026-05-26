package oop_00000133646_cleverlyvictoriaurselialangitan.week14

class UserValidator {
    fun validate(user: User): Boolean =
        user.email.contains("@") && user.age >= 18
}

class UserRepository {
    fun save(user: User) {
        println("Saving user: ${user.name} to Database")
    }
}