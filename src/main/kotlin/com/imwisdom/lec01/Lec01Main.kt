package com.imwisdom.lec01

fun main(){

    var number1 = 10L;  //변경가능
    val number2 = 10L;  //변경불가

    var number3: Long? = 1_000L;    //null 사용을 위해 ? 표시
    number3 = null;

    var person = Person("김지혜");

}