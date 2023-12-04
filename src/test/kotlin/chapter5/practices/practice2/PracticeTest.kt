package chapter5.practices.practice2

import chapter3.examples.list1.List
import chapter5.examples.example2.Stream
import chapter5.practices.practice1.toList
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "Stream.take 테스트" {
        val stream = Stream.of(1, 2, 3, 4, 5)
        val expected = List.of(1, 2, 3)

        stream.take(3).toList() shouldBe expected
    }

    "Stream.drop 테스트" {
        val stream = Stream.of(1, 2, 3, 4, 5)
        val expected = List.of(4, 5)

        stream.drop(3).toList() shouldBe expected
    }
})