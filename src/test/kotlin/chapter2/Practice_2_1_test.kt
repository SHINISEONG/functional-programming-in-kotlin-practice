package chapter2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Practice_2_1_test {
    @Test
    fun `주어진 숫자 번째의 피보나치 수 검증`() {
        val expectedFifthFibNum = 3
        val actualFifthFibNum = fib(5)

        assertEquals(expectedFifthFibNum, actualFifthFibNum)
    }

    @Test
    fun `주어진 숫자까지 피보나치 수열 검증`() {
        val expectedSequence = listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
        val actualSequence = fibSequence(11)

        assertEquals(expectedSequence, actualSequence)
    }
}