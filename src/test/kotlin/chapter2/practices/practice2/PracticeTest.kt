package chapter2.practices.practice2

import kotlin.test.Test
import kotlin.test.assertEquals

class PracticeTest {
    @Test
    fun `정렬되지 않은 숫자 리스트 정렬 여부 확인 함수 검증`() {
        val listOfInt = listOf(3, 2, 3, 4, 1, 6, 7, 8, 9, 10)

        assertEquals(false, isSorted(listOfInt) { n, m -> n > m })
        assertEquals(false, isSorted(listOfInt) { n, m -> n < m })
    }

    @Test
    fun `오름차순 정렬된 숫자 리스트 정렬 여부 확인 함수 검증`() {
        val listOfInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        assertEquals(false, isSorted(listOfInt) { n, m -> n > m })
        assertEquals(true, isSorted(listOfInt) { n, m -> n < m })
    }

    @Test
    fun `내림차순 정렬된 숫자 리스트 정렬 여부 확인 함수 검증`() {
        val listOfInt = listOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

        assertEquals(true, isSorted(listOfInt) { n, m -> n > m })
        assertEquals(false, isSorted(listOfInt) { n, m -> n < m })
    }

    @Test
    fun `내용이 중복된 숫자 리스트 정렬 여부 확인 함수 검증`() {
        val listOfInt = listOf(1, 2, 2, 2, 3)

        assertEquals(false, isSorted(listOfInt) { n, m -> n >= m })
        assertEquals(true, isSorted(listOfInt) { n, m -> n <= m })
    }

    @Test
    fun `마지막만 정렬되지 않은 리스트 정렬 여부 확인 함수 검증`() {
        val listOfInt = listOf(1, 2, 3, 4, 5, 1)

        assertEquals(false, isSorted(listOfInt) { n, m -> n >= m })
        assertEquals(false, isSorted(listOfInt) { n, m -> n <= m })
    }
    @Test
    fun `문자 리스트 정렬 여부 확인 함수 검증`() {
        val listOfString = listOf("a", "b", "c")

        assertEquals(false, isSorted(listOfString) { n, m -> n >= m })
        assertEquals(true, isSorted(listOfString) { n, m -> n <= m })
    }

    @Test
    fun `빈 리스트 정렬 여부 확인 검증`() {
        val emptyList = emptyList<Int>()

        assertEquals(true, isSorted(emptyList) { n, m -> n >= m })
        assertEquals(true, isSorted(emptyList) { n, m -> n <= m })
    }

    @Test
    fun `원소가 하나인 리스트 정렬 여부 확인 검증`() {
        val listOfInt = listOf(1)

        assertEquals(true, isSorted(listOfInt) { n, m -> n >= m })
        assertEquals(true, isSorted(listOfInt) { n, m -> n <= m })
    }
}