package chapter5.practices.practice10

import chapter3.examples.list1.List
import chapter5.practices.practice1.toList
import chapter5.practices.practice2.take
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "fibs() Test" {
        fibs().take(4).toList() shouldBe List.of(0, 1, 1, 2)
    }
})