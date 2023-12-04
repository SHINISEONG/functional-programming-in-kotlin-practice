package chapter4.practices.practice4

import chapter3.examples.list1.List
import chapter4.examples.example3.None
import chapter4.examples.example3.Some
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "sequence 테스트" {
        val options = List.of(Some(10), Some(20), Some(30))
        sequence(options) shouldBe Some(List.of(10, 20, 30))
    }

    "sequence 테스트 2" {
        val options = List.of(Some(10), None, Some(30))
        sequence(options) shouldBe None
    }
})