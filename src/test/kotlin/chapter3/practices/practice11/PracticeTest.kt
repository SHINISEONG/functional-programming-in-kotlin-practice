package chapter3.practices.practice11

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "reverse 테스트"{
        reverse(List.of(1, 2, 3)) shouldBe List.of(3, 2, 1)
        reverse(List.of("a", "b", "c")) shouldBe List.of("c", "b", "a")
    }
})