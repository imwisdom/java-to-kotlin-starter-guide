package com.imwisdom.lec09

import java.lang.IllegalArgumentException

fun main() {
    val person = Person("wisdom", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val person2 = Person("wisdom")
    println(person2.age)

    Student()

    Person()
}
class Person(
    name: String = "wisdom",
    var age: Int,
) {
    var name: String = name
        set(value) {
            field = value.uppercase()
        }

    val upperName: String
        get() = this.name.uppercase()

    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    val isAdult: Boolean //함수 대신 프로퍼티로 만듦
        get() = this.age >= 20

    //부생성자
    //최종적으로 주생성자를 this로 호출해야됨
    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor(): this("wisdom") {
        println("두번째 부생성자")
    }
}

class Student   //파라미터가 없을 경우 생략 가능