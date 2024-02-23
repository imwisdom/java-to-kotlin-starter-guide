package com.imwisdom.lec10

class Cat(
    species: String
) : Animal(species, 4) {    // Animal 클래스 상속받음
    override fun move() {
        println("고양이가 사뿐사뿐 걸어간다")
    }
}