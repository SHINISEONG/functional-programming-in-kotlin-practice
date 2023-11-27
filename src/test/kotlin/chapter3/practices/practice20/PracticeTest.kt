package chapter3.practices.practice20

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "filterFromFlatMap 테스트" {
        filterFromFlatMap(
            List.of(1, 2, 3, 4, 5, 6)
        ) { it % 2 == 0} shouldBe List.of(2, 4, 6)
    }
})