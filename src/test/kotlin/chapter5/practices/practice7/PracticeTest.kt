package chapter5.practices.practice7

import chapter3.examples.list1.List
import chapter5.examples.example2.Stream
import chapter5.practices.practice1.toList
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "mapTest" {
        Stream.of(1, 2, 3, 4).map { "${it}A" }.toList() shouldBe List.of("1A", "2A", "3A", "4A")
    }

    "filterTest" {
        Stream.of(1, 2, 3, 4).filter { it % 2 == 0 }.toList() shouldBe List.of(2, 4)
    }

    "appendTest" {
        Stream.of(1, 2).append { Stream.of(3, 4) }.toList() shouldBe List.of(1, 2, 3, 4)
    }

    "flatMap" {
        Stream.of(1, 2).flatMap { Stream.of("$it", "${it * 2}") }
            .toList() shouldBe List.of("1", "2", "2", "4")
    }
})