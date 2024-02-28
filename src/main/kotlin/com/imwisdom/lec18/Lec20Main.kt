package com.imwisdom.lec18

import com.imwisdom.lec09.Person

fun main() {

    val strings = listOf("Apple", "Car")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }

    val numbers = listOf("one", "two", "three")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    mutableListOf("one", "two", "three")
        .also{ println("The list elements before adding new one: $it") }
        .add("four")
}

fun printPerson(person: Person?) {
    person?.let{// scope function
        println(it.name)
        println(it.age)
    }
}
