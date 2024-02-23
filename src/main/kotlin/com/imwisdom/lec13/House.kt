package com.imwisdom.lec13


fun main() {

}
class House (
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private val area: Double
    )
    inner class LivingRoomInner(    //바깥클래스와 연결된 중첩클래스(권장되지않음)
        private val area: Double
    ) {
        val address: String
            get() = this@House.address  //바깥클래스 참조를 위해 this@바깥클래스
    }
}