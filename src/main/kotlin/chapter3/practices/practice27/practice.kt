package chapter3.practices.practice27

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import chapter3.examples.list12.Tree

fun <A, B> map(tree: Tree<A>, fn: (A) -> B): Tree<B> =
    when (tree) {
        is Leaf -> Leaf(fn(tree.value))
        is Branch -> {
            Branch(
                left = map(tree.left, fn),
                right = map(tree.right, fn)
            )
        }
    }