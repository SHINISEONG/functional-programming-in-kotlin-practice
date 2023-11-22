package chapter2.practices.practice5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PracticeTest {
    @Test
    fun `두 고차함수를 합성하는 고차함수 테스트`() {
        val fn1 = { b:String -> listOf("$b fn1이 동작")}
        val fn2 = { a:Int -> "$a fn2가 동작" }
        val composedFn: (Int) -> List<String> = compose(fn1, fn2)
        val actual = composedFn(1)
        assertEquals(listOf("1 fn2가 동작 fn1이 동작"), actual)
    }
}