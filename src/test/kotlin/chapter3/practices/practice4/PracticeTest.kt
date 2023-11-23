package chapter3.practices.practice4

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest: StringSpec({
    "dropWhile(l: List<A>, fn: (A)->Boolean)함수는 조건에 맞는 연속된 원소들을 list에서 제거해야 한다."{
        val list = List.of("a", "b", "c", "d", "e", "f", "A", "a")
        val expected = List.of("A", "a")
        dropWhile(list){ it.isLowercase() } shouldBe expected
    }

})

fun String.isLowercase(): Boolean = this.lowercase() == this