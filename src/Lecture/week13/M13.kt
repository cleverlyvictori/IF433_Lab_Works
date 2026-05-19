package Lecture.week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    println("=== cara baca 1");
    val fileSaya = File("src/Lecture/week13/file.txt")
    val bacaFile = fileSaya.readText()
    println(bacaFile)


    println("=== cara baca 2");
    val fileKamu = File("src/Lecture/week13/file.txt")
    val bacaFile2 = fileKamu.readLines()

    bacaFile2.forEach {
        println("ke 2::: $it")
    }

    println("=== cara baca 3");
    val br = BufferedReader(
        FileReader("src/Lecture/week13/file.txt")
    )

    var baris: String? = br.readLine()

    while (baris != null) {
        println(baris)
        baris = br.readLine()
    }

    br.close()

    println("=== cara baca buff");
    val br2 = BufferedReader(FileReader("src/Lecture/week13/file.txt"));
    br2.use{
        baris -> baris.lineSequence()
        .filter { it.isNotEmpty() }
        .forEach { println(it) }
    }

    println("=== cara buat file 1 ===");
    val fileBuat1 = File("src/Lecture/week13/fileBuat1.txt");
    fileBuat1.writeText("ini adalah bariss pertama\nINI KEDUA");

    fileBuat1.appendText("\nINI KETIGA")
    fileBuat1.appendText("\nINI EMPATTT")
    fileBuat1.appendText("\nINI limamamammamamama")

    val contohList = listOf("\nNasi Goreng", "Bakpao", "Siomay");
    fileBuat1.appendText(contohList.joinToString("\n"));

    println("=== cara buat file 2 ===");
    fileBuat1.printWriter().use {
        out -> out.println("ini contoh baris pertama printWriter");
        out.println("INI KEDUA printWriter")
        out.println("INI KEtigaa printWriter")
    }
}


