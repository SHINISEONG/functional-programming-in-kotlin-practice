package chapter3.practices.practice16

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "doubleListToString Test" {
        doubleListToString(List.of(1.1, 2.2, 3.3)) shouldBe List.of("1.1", "2.2", "3.3")
    }
})