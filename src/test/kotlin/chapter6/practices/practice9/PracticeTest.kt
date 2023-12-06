package chapter6.practices.practice9

import chapter6.examples.randomGenerator1
import chapter6.practices.practice1.nonNegativeInt
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "mapByFlatMap Test" {
        val result = mapByFlatMap(::nonNegativeInt) { it.toString() }(randomGenerator1)
        result.first shouldBe "1"
    }
    "map2ByFlatMap Test" {
        val result = map2ByFlatMap(::nonNegativeInt, ::nonNegativeInt) { a, b -> a + b }(randomGenerator1)
        result.first shouldBe 2
    }
})
