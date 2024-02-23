package com.imwisdom.lec10
abstract class Animal ( // 추상클래스
    protected val species: String,
    protected open val legCount: Int,   //override를 위해 open 키워드 필요
) {
    abstract fun move()
}