package com.imwisdom.lec03

import com.lannstark.lec03.Person


fun main(){
    val number1 = 3
    val number2: Long = number1.toLong()    //type 변환을 위해 to처리 필요

    val number3  = 5
    val result = number1 / number2.toDouble()

    val number4: Int? = 3
    val number5: Long = number4?.toLong() ?: 0L //nullable 처리 필요

    printAgeIfPerson(Person("wisdom", 12))

    val person = Person("wisdom", 100)
    println("이름 : ${person.name}")

    val name = "wisdom"
    val str = """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])
    println(str2[2])

}

fun printAgeIfPerson(obj: Any?){
//    if(obj is Person){
//        println(obj.age);
//    }
    // null이 아니면 Person type으로 변환
    val person: Person? = obj as? Person //obj에 null이 있을 경우
    println(person?.age)
}
