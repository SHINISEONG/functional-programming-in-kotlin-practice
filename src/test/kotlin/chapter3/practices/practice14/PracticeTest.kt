package chapter3.practices.practice14

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest: StringSpec({
    "combine Test" {
        combine(
            List.of(
                List.of("A", "B"),
                List.of("AA", "BB"),
                List.of("AAA", "BBB")
            )
        ) shouldBe List.of("A", "B", "AA", "BB", "AAA", "BBB")
    }

    "concatFromFoldRight Test" {
        concatFromFoldRight(
            List.of(
                List.of("A", "B"),
                List.of("AA", "BB"),
                List.of("AAA", "BBB")
            )
        ) shouldBe List.of("A", "B", "AA", "BB", "AAA", "BBB")
    }

    "concatFromFoldLeft Test" {
        concatFromFoldLeft(
            List.of(
                List.of("A", "B"),
                List.of("AA", "BB"),
                List.of("AAA", "BBB")
            )
        ) shouldBe List.of("A", "B", "AA", "BB", "AAA", "BBB")
    }
})