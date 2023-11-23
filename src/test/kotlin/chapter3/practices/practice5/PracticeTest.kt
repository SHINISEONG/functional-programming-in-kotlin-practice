package chapter3.practices.practice5

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest: StringSpec({
    "init(l: List<A>)함수는 마지막 원소를 제외한 List를 리턴해야 한다."{
        val list = List.of("A", "B", "C", "D", "E")
        val expected = List.of("A", "B", "C", "D")

        init(list) shouldBe expected
    }
})