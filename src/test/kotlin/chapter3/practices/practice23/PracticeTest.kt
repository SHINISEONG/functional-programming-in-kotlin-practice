package chapter3.practices.practice23

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "hasSubSequence 테스트" {
        hasSubsequence(
            List.of("a", "b", "c"),
            List.of("b")
        ) shouldBe true
    }

    "hasSubSequence 테스트2" {
        hasSubsequence(
            List.of("a", "b", "c"),
            List.of("b", "c")
        ) shouldBe true
    }

    "hasSubSequence 테스트3" {
        hasSubsequence(
            List.of("a", "b", "c"),
            List.of("a", "c")
        ) shouldBe false
    }
    "hasSubSequence 테스트4" {
        hasSubsequence(
            List.of("a", "b", "c"),
            List.of("a", "b")
        ) shouldBe true
    }

    "hasSubSequence 테스트5" {
        hasSubsequence(
            List.of("a", "b", "c", "d"),
            List.of("b", "c")
        ) shouldBe true
    }
})