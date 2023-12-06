package chapter6.practices.practice10

import chapter3.examples.list1.List
import chapter6.examples.example3.RandomGenerator
import chapter6.examples.randomGenerator1
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "unit Test" {
        State.unit<RandomGenerator, Int>(1)
            .run(randomGenerator1) shouldBe (1 to randomGenerator1)
    }

    "map Test" {
        State.unit<RandomGenerator, Int>(1).map { it.toString() }
            .run(randomGenerator1) shouldBe ("1" to randomGenerator1)
    }

    "flatMap Test" {
        State.unit<RandomGenerator, Int>(1)
            .flatMap { int ->
                State.unit(int.toString())
            }.run(randomGenerator1) shouldBe ("1" to randomGenerator1)
    }

    "map2 Test" {
        State.map2(
            State.unit<RandomGenerator, Int>(1),
            State.unit<RandomGenerator, Int>(2)
        ) { a, b -> a + b }.run(randomGenerator1) shouldBe (3 to randomGenerator1)
    }

    "sequence Test" {
        State.sequence(
            List.of(
                State.unit<RandomGenerator, Int>(1),
                State.unit<RandomGenerator, Int>(2),
                State.unit<RandomGenerator, Int>(3),
                State.unit<RandomGenerator, Int>(4)
            )
        ).run(randomGenerator1).first shouldBe List.of(1, 2, 3, 4)
    }
})