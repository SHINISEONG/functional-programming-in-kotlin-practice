package chapter3.practices.practice15

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "plusOne Test" {
        plusOne(List.of(1, 2, 3)) shouldBe List.of(2, 3, 4)
    }
})