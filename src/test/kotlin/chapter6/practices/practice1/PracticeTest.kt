package chapter6.practices.practice1

import chapter6.examples.example3.RandomGenerator
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "nonNegativeInt" should {

        val randomGeneratorMock = RandomGenerator { TODO() }

        "return 0 if nextInt() yields 0" {

            val randomGenerator0 = RandomGenerator { 0 to randomGeneratorMock }

            nonNegativeInt(randomGenerator0) shouldBe (0 to randomGeneratorMock)
        }

        "return Int.MAX_VALUE when nextInt() yields Int.MAX_VALUE" {

            val randomGeneratorMax = RandomGenerator { Int.MAX_VALUE to randomGeneratorMock }

            nonNegativeInt(randomGeneratorMax) shouldBe (Int.MAX_VALUE to randomGeneratorMock)
        }

        "return Int.MAX_VALUE when nextInt() yields Int.MIN_VALUE" {

            val randomGeneratorMin = RandomGenerator { Int.MIN_VALUE to randomGeneratorMock }

            nonNegativeInt(randomGeneratorMin) shouldBe (Int.MAX_VALUE to randomGeneratorMock)
        }

        "return 0 when nextInt() yields -1" {

            val randomGeneratorNegative = RandomGenerator { -1 to randomGeneratorMock }

            nonNegativeInt(randomGeneratorNegative) shouldBe (0 to randomGeneratorMock)
        }
    }
})