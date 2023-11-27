package chapter3.practices.practice17

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "map Test" {
        map(List.of("A", "B", "C")) { it + "K"} shouldBe List.of("AK", "BK", "CK")
    }
})