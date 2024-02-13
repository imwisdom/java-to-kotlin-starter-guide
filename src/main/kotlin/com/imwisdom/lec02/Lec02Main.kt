package com.imwisdom.lec02
import java.lang.IllegalArgumentException

fun main(){

    var str: String? = "ABC"
    println(str?.length ?: 0)  // null이면 0
    println(startsWith("a"));
}
fun startsWithA1(str: String?): Boolean{
//    if(str == null){
//        throw IllegalArgumentException("null이 들어왔습니다.");
//    }
//    return str.startsWith("A");
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
//    if(str == null){
//        return null;
//    }
//    return str.startsWith("A");
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if(str == null){
//        return false;
//    }
//    //str이 확실히 null이 아님으로 인식되어 오류x
//    return str.startsWith("A");
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
