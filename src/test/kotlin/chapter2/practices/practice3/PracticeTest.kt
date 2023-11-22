package chapter2.practices.practice3

import kotlin.test.Test
import kotlin.test.assertEquals

class PracticeTest {
    @Test
    fun `커링 테스트`() {
        val aToBToCFun = curry { a:Int, b:List<Int> -> a.toString() + b.toString() }
        val expected = "1[1, 2, 3]"
        val actual = aToBToCFun(1)(listOf(1, 2, 3))
        assertEquals(expected, actual)
    }
}
