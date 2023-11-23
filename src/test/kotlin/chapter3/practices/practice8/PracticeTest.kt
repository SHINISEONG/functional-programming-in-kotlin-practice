package chapter3.practices.practice8

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "length(list: List<A>): Int 함수는 list의 길이를 반환한다." {
        length(List.of("a", "b", "c")) shouldBe 3
    }
})