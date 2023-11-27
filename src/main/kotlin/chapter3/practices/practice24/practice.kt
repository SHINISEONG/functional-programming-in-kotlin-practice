package chapter3.practices.practice24

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import chapter3.examples.list12.Tree

fun <A> size(tree: Tree<A>): Int =
    when (tree) {
        is Leaf -> 1
        is Branch -> 1 + size(tree.left) + size(tree.right)
    }

