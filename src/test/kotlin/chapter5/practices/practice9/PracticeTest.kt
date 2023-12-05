package chapter5.practices.practice9

import chapter3.examples.list1.List
import chapter5.practices.practice1.toList
import chapter5.practices.practice2.take
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "from 테스트" {
        from(0).take(3).toList() shouldBe List.of(0, 1, 2)
    }
})