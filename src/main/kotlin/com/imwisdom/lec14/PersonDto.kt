package com.imwisdom.lec14


fun main() {
    val dto1 = PersonDto("wisdom", 100)
    val dto2 = PersonDto("wisdom", 200)
    println(dto1 == dto2)
    println(dto1)
}
data class PersonDto(   //equals, hashCode, toString을 자동으로 만들어줌
    val name: String,
    val age: Int,
) {
}