package chapter2.practices.practice4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PracticeTest {
    @Test
    fun `uncurry를 테스트 합니다`() {
        val a: (Int, Int) -> (String) = uncurry{ a -> { b -> "$a, $b" } }

        val actual = a(1, 2)
        assertEquals("1, 2", actual)
    }
}