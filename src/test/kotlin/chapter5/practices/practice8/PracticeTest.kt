package chapter5.practices.practice8

import chapter3.examples.list1.List
import chapter5.practices.practice1.toList
import chapter5.practices.practice2.take
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "constant 테스트" {
        constant("a").take(5).toList() shouldBe List.of("a", "a", "a", "a", "a")
    }
})