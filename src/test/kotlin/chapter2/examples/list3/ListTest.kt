package chapter2.examples.list3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ListTest {
    @Test
    fun `배열에서 어떤 문자열을 찾는 단형적 함수 검증`(){
        val strings = arrayOf("가", "나", "다", "라")
        val expected = -1
        val actual = findFirst(strings, "바")
        assertEquals(expected, actual)
    }
}