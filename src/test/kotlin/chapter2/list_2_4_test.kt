package chapter2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class list_2_4_test {
    @Test
    fun `배열에서 어떤 문자열을 찾는 단형적 함수 검증`(){
        val strings = arrayOf("가", "나", "다", "라")
        val numbers = arrayOf(1, 2, 3, 4)
        val expected = 1
        val actual1 = findFirst<String>(strings) { "나" == it }
        val actual2 = findFirst<String>(strings, "나")
        val actual3 = findFirst(numbers, 2)
        val actual4 = findFirst<Int>(numbers){ 2 == it }
        assertEquals(expected, actual1)
        assertEquals(expected, actual2)
        assertEquals(expected, actual3)
        assertEquals(expected, actual4)
    }
}