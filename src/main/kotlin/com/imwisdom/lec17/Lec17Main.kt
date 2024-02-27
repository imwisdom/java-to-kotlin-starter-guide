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
        Fruit("사과", 0),
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

    var apples = fruits.filter { fruit -> fruit.name == "사과" }
    var appleIdx = fruits.filterIndexed { idx, fruit -> 
        println(idx)
        fruit.name == "사과"
    }
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price}
    println(applePrices)

    val applePricesIdx = fruits.filter { fruit -> fruit.name == "사과"}
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.price
        }

    val values = fruits.filter { fruit -> fruit.name == "사과"}
        .mapNotNull { fruit -> fruit.nullOrValue() }
    println(values)

    val isAllApple = fruits.all { fruit -> fruit.name == "사과"}
    println(isAllApple)

    val isNoApple = fruits.none { fruit -> fruit.name == "사과"}
    println(isNoApple)

    val isAnyApple = fruits.any { fruit -> fruit.name == "사과"}
    println(isAnyApple)

    val count = fruits.count()
    println(count)

    val sorted = fruits.sortedBy { fruit -> fruit.price }

    val sortedDesc = fruits.sortedByDescending { fruit -> fruit.price }

    val distinctName = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }
    println(distinctName)

    println(fruits.first().name)
    println(fruits.firstOrNull()?.name)

    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    // val mapAssociate: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    //key : name, value : price
    val mapGrp: Map<String, List<Int>> = fruits
        .groupBy({ fruit -> fruit.name }, { fruit -> fruit.price })
    println(mapGrp)
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean //Fruit 파라미터를 받고 Boolean 리턴을 하는 함수를 파라미터로 받음
): List<Fruit> {
    return fruits.filter(filter)
}

private fun Fruit.nullOrValue(): Int? {
    return when (this.price){   //java의 switch
        null, 0 -> null
        else -> this.price
    }
}