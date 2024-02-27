package com.imwisdom.lec17

import com.lannstark.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과 "}

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" } //람다가 마지막 파라미터일 경우 괄호에서 빼서 기입 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" }    //타입추론 가능해서 타입 생략가능
    filterFruits(fruits) { it.name == "사과" }    //람다 파라미터가 하나밖에 없을때 it 사용
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean //Fruit 파라미터를 받고 Boolean 리턴을 하는 함수를 파라미터로 받음
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}