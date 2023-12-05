package chapter5.practices.practice11

import chapter3.examples.list1.List
import chapter4.examples.example3.Some
import chapter5.practices.practice1.toList
import chapter5.practices.practice2.take
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "unfoldTest" {
        unfold(0) { s: Int -> Some(s to (s + 1)) }
            .take(5).toList() shouldBe List.of(0, 1, 2, 3, 4)
    }
})