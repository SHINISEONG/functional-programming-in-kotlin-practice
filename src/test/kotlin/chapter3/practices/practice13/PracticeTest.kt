package chapter3.practices.practice13

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest: StringSpec({
    "appendFromFoldRightTest" {
        appendFromFoldRight(
            List.of("A", "B", "C"),
            List.of("AA", "BB", "CC")
        ) shouldBe List.of("A", "B", "C", "AA", "BB", "CC")
    }
    "appendFromFoldLeftTest" {
        appendFromFoldLeft(
            List.of("A", "B", "C"),
            List.of("AA", "BB", "CC")
        ) shouldBe List.of("A", "B", "C", "AA", "BB", "CC")
    }
})