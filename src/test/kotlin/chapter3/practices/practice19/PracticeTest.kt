package chapter3.practices.practice19

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "flatMap 테스트" {
        flatMap(
            List.of(1, 2, 3)
        ) { List.of("${it}A", "${it}B") } shouldBe List.of("1A", "1B", "2A", "2B", "3A", "3B")
    }
    "flatMapAnswer 테스트" {
        flatMapAnswer(
            List.of(1, 2, 3)
        ) { List.of("${it}A", "${it}B") } shouldBe List.of("1A", "1B", "2A", "2B", "3A", "3B")
    }
})