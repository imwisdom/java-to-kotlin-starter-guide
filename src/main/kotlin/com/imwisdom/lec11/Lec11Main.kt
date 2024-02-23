package com.imwisdom.lec11

fun main(){

}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}