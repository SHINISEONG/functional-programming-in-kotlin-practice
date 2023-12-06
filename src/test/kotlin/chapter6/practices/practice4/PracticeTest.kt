package chapter6.practices.practice4

import chapter3.examples.list1.List
import chapter6.examples.randomGenerator1
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "ints" should {
        "주어진 길이의 리스트를 반환해야 한다." {
            ints(5, randomGenerator1) shouldBe (List.of(1, 1, 1, 1, 1) to randomGenerator1)
        }
    }
})