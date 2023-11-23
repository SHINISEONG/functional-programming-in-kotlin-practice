package chapter3.practices.practice1

import chapter3.examples.list1.List
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PracticeTest {
    @Test
    fun `List의 첫 번째 원소를 제거하는 tail 함수 테스트`() {
        val list = List.of("가", "나", "다", "라", "마")
        val tail = tail(list)
        val list2 = List.of("나", "다", "라", "마")

        assertEquals(list2, tail)

    }
}