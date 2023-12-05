package chapter5.practices.practice5

import chapter3.examples.list1.List
import chapter5.examples.example2.Stream
import chapter5.practices.practice1.toList
import chapter5.practices.practice3.takeWhile
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "takeWhileFromFoldRight Test" {
        Stream.of(1, 2, 3, 4, 5).takeWhile { it < 4 }.toList() shouldBe List.of(1, 2, 3)
    }
})