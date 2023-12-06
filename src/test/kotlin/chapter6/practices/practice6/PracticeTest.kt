package chapter6.practices.practice6

import chapter6.examples.randomGenerator1
import chapter6.practices.practice1.nonNegativeInt
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "map2 Test" {
        val aPlusB = map2(::nonNegativeInt, ::nonNegativeInt) { a, b -> a + b + 2 }
        aPlusB(randomGenerator1) shouldBe (4 to randomGenerator1)
    }
})