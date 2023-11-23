package chapter3.practices.practice7

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest: StringSpec({
    "copy(list: List<A>)함수는 list를 복제한다." {
        copy(List.of("1", "2", "3")) shouldBe List.of("1", "2", "3")
    }
})