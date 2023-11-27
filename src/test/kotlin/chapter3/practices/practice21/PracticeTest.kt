package chapter3.practices.practice21

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "zipPlusTest" {
        zipPlus(
            List.of(1, 2, 3),
            List.of(4, 5, 6)
        ) shouldBe List.of(5, 7, 9)
    }
})