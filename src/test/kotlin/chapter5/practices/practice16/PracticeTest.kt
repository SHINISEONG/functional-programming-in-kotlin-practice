package chapter5.practices.practice16

import chapter3.examples.list1.List
import chapter5.examples.example2.Stream
import chapter5.practices.practice1.toList
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "scanRight 테스트" {
        Stream.of(1, 2, 3).scanRight(1) { a, b -> a + b() }.toList() shouldBe
                List.of(7, 6, 4, 1)
    }
})