package com.imwisdom.lec14


fun main() {
    handleCar(Avante())
}
fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println("avante")
        is Grandeur -> println("grandeur")
        is Sonata -> println("sonata")
    }
}
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        //else 작성 필요 x
    }
}
enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}

sealed class HyundaiCar (
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그렌저", 3_000L)