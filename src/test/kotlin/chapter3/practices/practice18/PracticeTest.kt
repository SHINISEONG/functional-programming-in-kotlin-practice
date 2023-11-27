package chapter3.practices.practice18

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "filterTest" {
        filter(
            List.of(1, 2, 3, 4, 5)
        ) { it % 2 == 0 } shouldBe List.of(2, 4)
    }
    "filterFromFoldRightTest" {
        filterFromFoldRight(
            List.of(1, 2, 3, 4, 5)
        ) { it % 2 == 0 } shouldBe List.of(2, 4)
    }
})