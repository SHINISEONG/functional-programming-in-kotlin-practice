package chapter6.practices.practice8

import chapter6.examples.MaxRandomGenerator
import chapter6.examples.example8.unit
import chapter6.examples.randomGenerator1
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "flatMap Test" {
        val result = flatMap(unit(1)) { int ->
            unit(int.toString())
        }(randomGenerator1)

        result.first shouldBe "1"
        result.second shouldBe randomGenerator1
    }
    "nonNegativeLesThanByFlatMap Test" {
        val result = nonNegativeLesThanByFlatMap(1)(randomGenerator1)
        result.first shouldBe 0

        val result2 = nonNegativeLesThanByFlatMap(10)(randomGenerator1)
        result2.first shouldBe 1

    }
})