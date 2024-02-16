package com.imwisdom.lec07

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {

}

fun parseIntOrThrow(str: String): Int {
    try{
        return str.toInt();
    }catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

// exception 뜰경우 null로 리턴
fun parseIntOrThrowV2(str: String): Int? {
    return try{
        str.toInt();
    }catch (e: NumberFormatException) {
        null
    }
}

