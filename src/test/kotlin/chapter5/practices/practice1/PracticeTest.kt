package chapter5.practices.practice1

import chapter3.examples.list1.List
import chapter5.examples.example2.Stream
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "Stream.toListUnsafe 테스트" {
        val stream = Stream.of(1, 2, 3, 4, 5)
        val expected = List.of(1, 2, 3, 4, 5)

        stream.toListUnsafe() shouldBe expected
    }
    "Stream.toList 테스트" {
        val stream = Stream.of(1, 2, 3, 4, 5)
        val expected = List.of(1, 2, 3, 4, 5)

        stream.toList() shouldBe expected
    }
})
