package com.imwisdom.lec12

import com.lannstark.lec12.Movable


fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {    //익명클래스
        override fun move() {
            println("움직인다")
        }
        override fun fly() {
            println("날다날다")
        }
    })
}
class Person private constructor(
    var name: String,
    var age: Int,
) {
    companion object Factory : Log{ //이름이 없으면 "Companion"이 기본 이름
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행객체 Factory")
        }
    }
}

//싱글톤 클래스
object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}