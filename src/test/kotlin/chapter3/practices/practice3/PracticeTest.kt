package chapter3.practices.practice3

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest: StringSpec({
    "<A> drop(l: List<A>, n: Int) 함수는 n번째 원소까지 제거된 리스트를 반환한다" {
        val list = List.of("a", "b", "c", "d", "e", "f")
        val list2 = List.of("d", "e", "f")
        drop(list, 3) shouldBe list2
    }
})