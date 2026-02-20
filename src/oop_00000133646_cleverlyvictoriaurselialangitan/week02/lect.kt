package oop_00000133646_cleverlyvictoriaurselialangitan.week02

import com.sun.tools.javac.code.TypeAnnotationPosition.field


fun main() {
    var age: Int = 0
    set(value) {
        if (value>= 0) field = value
    }
}