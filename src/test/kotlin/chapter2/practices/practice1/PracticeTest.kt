package chapter2.practices.practice1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PracticeTest {
    @Test
    fun `주어진 숫자 번째의 피보나치 수 검증`() {
        val expectedFifthFibNum = 5
        val actualFifthFibNum = fib(5)

        assertEquals(expectedFifthFibNum, actualFifthFibNum)
    }

    @Test
    fun `주어진 숫자까지 피보나치 수열 검증`() {
        val expectedSequence = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
        val actualSequence = fibSequence(10)

        assertEquals(expectedSequence, actualSequence)
    }

    @Test
    fun `포맷팅 된 문자열로 출력 검증`() {
        val expectedString = "fibonacci of 5 is 5"
        val actualString = formatResult("fibonacci", 5, ::fib)
    }

    @Test
    fun `포매팅 된 문자열 출력 익명 함수 검증`() {
        val expected = "abs of -1 is 1"
        val actual = formatResult("abs", -1) { if (it < 0) -it else it }
    }
}