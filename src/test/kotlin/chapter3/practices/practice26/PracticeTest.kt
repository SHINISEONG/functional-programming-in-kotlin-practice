package chapter3.practices.practice26

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "depth Test" {
        depth(
            Branch(
                left = Branch(
                    left = Branch(
                        left = Leaf(1),
                        right = Branch(
                            left = Leaf(1),
                            right = Leaf(0)
                        )
                    ),
                    right = Leaf(12)
                ),
                right = Leaf(6)
            )
        ) shouldBe 4
    }
})