package chapter6.practices.practice7

import chapter3.examples.list1.List
import chapter6.examples.example8.unit
import chapter6.examples.randomGenerator1
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "sequence Test" {
        sequence(
            List.of(
                unit(1),
                unit(2),
                unit(3),
                unit(4),
                unit(5)
            )
        )(randomGenerator1).first shouldBe List.of(1, 2, 3, 4, 5)
    }

    "sequenceFromFoldRight Test" {
        sequenceFromFoldRight(
            List.of(
                unit(1),
                unit(2),
                unit(3),
                unit(4),
                unit(5)
            )
        )(randomGenerator1).first shouldBe List.of(1, 2, 3, 4, 5)
    }

    "intsFromSequence Test" {
        intsFromSequence(5, randomGenerator1).first shouldBe List.of(1, 1, 1, 1, 1)
    }
})