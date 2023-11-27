package chapter3.practices.practice22

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "zipWith 테스트" {
        zipWith(
            List.of("A", "B", "C"),
            List.of("A", "B", "C")
        ) { a, b ->
            a + b
        } shouldBe List.of("AA", "BB", "CC")
    }
})