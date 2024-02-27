package com.imwisdom.lec16

import com.lannstark.lec16.Person

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 100)
    println(person.nextYearAge())


    println(3.add(4))
    println(3 add2 4)
}

fun String.lastChar(): Char {   // String 클래스 확장
    //this : 수신객체
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {   //중위함수
    return this + other
}

inline fun Int.add3(other: Int): Int {
    return this + other
}