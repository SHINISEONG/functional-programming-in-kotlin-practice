package chapter6.practices.practice3

import chapter6.examples.example3.RandomGenerator
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "intDouble, doubleInt, tripleDouble" should {

        val randomGeneratorMock = RandomGenerator { TODO() }

        val randomGenerator3 = RandomGenerator { Int.MAX_VALUE to randomGeneratorMock }

        val randomGenerator2 = RandomGenerator { Int.MAX_VALUE to randomGenerator3 }

        val randomGenerator = RandomGenerator { Int.MAX_VALUE to randomGenerator2 }

        "intDobule 사용시 Int.MAX_VALUE에 기반한 경우 int의 값은 Int.MAX_VALUE, double의 값은 1에 가까운 값이 나와야 한다" {

            val (intDouble, _) = intDouble(randomGenerator)
            val (int, double) = intDouble

            int shouldBe Int.MAX_VALUE
            double shouldBe 0.9999999995343387
        }


        "doubleInt 사용시 Int.MAX_VALUE에 기반한 경우 double의 값은 1에 가까운 값이 나와야 한다, int의 값은 Int.MAX_VALUE이다" {

            val (doubleInt, _) = doubleInt(randomGenerator)
            val (double, int) = doubleInt

            double shouldBe 0.9999999995343387
            int shouldBe Int.MAX_VALUE
        }

        "tripleDouble 사용시 Int.MAX_VALUE에 기반한 경우 triple의 값은 1에 가까운 값이 나와야 한다" {

            val (tripleDouble, _) = double3(randomGenerator)
            val (double1, double2, double3) = tripleDouble

            double1 shouldBe 0.9999999995343387
            double2 shouldBe 0.9999999995343387
            double3 shouldBe 0.9999999995343387
        }
    }
})