package chapter3.practices.practice2

import chapter3.examples.list1.List
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class PracticeTest: WordSpec({
    "<A> setHead(xs: List<A>, x: A)" should {
        "list의 첫 원소를 다른 값으로 대치한 새 list를 반환해야 한다." {
            val list1 = List.of("가", "나", "다", "라", "마")
            val list2 = List.of("a", "나", "다", "라", "마")
            setHead(list1, "a") shouldBe list2

        }
    }
})