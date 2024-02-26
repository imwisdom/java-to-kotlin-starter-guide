package com.imwisdom.lec15

fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    val array2 = array.plus(300)
    for ((idx, value) in array2.withIndex()) {
        println("$idx $value")
    }

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()
    printNumbrers(emptyList())  //type 추론이 가능하면 <> 생략가능

    println(numbers[0])
    for(number in numbers) {
        println(number)
    }

    for((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)
    println(mutableNumbers)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY") // key to value

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbrers(numbers: List<Int>) {

}