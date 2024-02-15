package com.imwisdom.lec04

import com.lannstark.lec04.JavaMoney

fun main(){

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {  //자동으로 compareTo 호출
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)
    println(money3 === money5)  //주소 비교
    println(money3 == money5)   //값 비교(equals)

    if(fun2() && fun1()){
        println("본문")
    }

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}