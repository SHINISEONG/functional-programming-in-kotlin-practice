package chapter5.practices.practice15

import chapter3.examples.list1.List
import chapter3.map
import chapter5.examples.example2.Stream
import chapter5.practices.practice1.toList
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "tails 테스트" {
        Stream.of(1, 2, 3).tails().toList().map { it.toList() } shouldBe List.of(
            List.of(1, 2, 3),
            List.of(2, 3),
            List.of(3),
        )
    }
})