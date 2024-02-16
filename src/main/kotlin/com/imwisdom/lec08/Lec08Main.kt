package com.imwisdom.lec08

fun main(){
    repeat("Hello World", useNewLine = true)

    printNameAndGender("wisdom", "FEMALE")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)    //spread 연산자 -> 배열안에있는 것들을 꺼내줌
}
//어떤 경우건 같은 타입을 반환할 경우 =을 사용하면 메소드 타입 생략 가능
//리턴 값이 하나일 경우 block을 생략하고 = 를 사용할 수 있음
fun max(a: Int, b: Int) = if (a > b) a else b

//type Unit은 생략 가능
fun repeat(str: String,
           num: Int = 3,
           useNewLine: Boolean = true) {
    for (i in 1 .. num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}
//가변인자 사용을 위해 앞에 vararg 붙여야됨 (String... 과 동일)
fun printAll(vararg strings: String){
    for (str in strings) {
        println(str)
    }
}