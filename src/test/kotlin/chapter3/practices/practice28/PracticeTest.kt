package chapter3.practices.practice28

import chapter3.examples.list12.Leaf
import io.kotest.core.spec.style.StringSpec
import chapter3.examples.list12.Branch
import chapter3.examples.list12.Tree
import chapter3.practices.practice27.map
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    val intTree = Branch(
        left = Branch(
            left = Leaf(1),
            right = Leaf(2)
        ),
        right = Leaf(5)
    )
    val stringTree = Branch(
        left = Branch(
            left = Leaf("1"),
            right = Leaf("2")
        ),
        right = Leaf("5")
    )

    "fold Test" {
        fold(
            intTree,
            { Leaf(it.toString()) },
            { l: Tree<String>, r: Tree<String> -> Branch(l, r) }
        ) shouldBe stringTree
    }

    "sizeF Test" {
        sizeF(intTree)
    }

    "maximumF Test" {
        maximumF(intTree)
    }

    "depthF Test" {
        depthF(intTree) shouldBe 2
    }

    "mapF Test" {
        map(intTree) { it.toString() } shouldBe stringTree
    }
})