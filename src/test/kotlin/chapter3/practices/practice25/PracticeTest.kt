package chapter3.practices.practice25

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "size 테스트" {
        maximum(
            Branch(
                left = Branch(
                    left = Leaf(1),
                    right = Leaf(12)
                ),
                right = Leaf(6)
            )
        ) shouldBe 12
    }
})