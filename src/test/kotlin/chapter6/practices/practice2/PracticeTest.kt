package chapter6.practices.practice2

import chapter6.examples.example3.RandomGenerator
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "double" should {

        val randomGeneratorMock = RandomGenerator { TODO() }

        "Int.MAX_VALUE에 기반한 경우 1에 가까운 값이 나와야 한다" {

            val randomGeneratorMax = RandomGenerator { Int.MAX_VALUE to randomGeneratorMock }

            double(randomGeneratorMax) shouldBe (0.9999999995343387 to randomGeneratorMock)
        }

        "0에 기반한 경우 0이 나와야 한다" {

            val randomGeneratorNegative = RandomGenerator { 0 to randomGeneratorMock }

            double(randomGeneratorNegative) shouldBe (0.0 to randomGeneratorMock)
        }
    }
})