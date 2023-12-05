package chapter5.practices.practice12

import chapter3.examples.list1.List
import chapter5.practices.practice1.toList
import chapter5.practices.practice2.take
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "onesFromUnfold 테스트" {
        onesFromUnfold().take(3).toList() shouldBe List.of(1, 1, 1)
    }

    "constantFromUnfold 테스트" {
        constantFromUnfold("a").take(3).toList() shouldBe List.of("a", "a", "a")
    }

    "fromFromUnfold 테스트" {
        fromFromUnfold(0).take(3).toList() shouldBe List.of(0, 1, 2)
    }

    "fibsFromUnfold 테스트" {
        fibsFromUnfold().take(4).toList() shouldBe List.of(0, 1, 1, 2)
    }

})