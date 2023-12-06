package chapter6.practices.practice5

import chapter6.examples.BELOW_ONE
import chapter6.examples.randomGeneratorMax
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "doubleR 테스트" {
        doubleR()(randomGeneratorMax) shouldBe (BELOW_ONE to randomGeneratorMax)
    }
})