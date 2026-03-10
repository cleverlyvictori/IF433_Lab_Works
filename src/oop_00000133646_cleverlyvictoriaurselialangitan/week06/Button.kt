package oop_00000133646_cleverlyvictoriaurselialangitan.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}