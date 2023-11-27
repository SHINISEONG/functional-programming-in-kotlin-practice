package chapter3.practices.practice24

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "size 테스트" {
        size(
            Branch(
                left = Branch(
                    left = Leaf(1),
                    right = Leaf(2)
                ),
                right = Leaf(5)
            )
        ) shouldBe 5
    }
})