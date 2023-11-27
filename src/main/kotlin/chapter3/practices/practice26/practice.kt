package chapter3.practices.practice26

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import chapter3.examples.list12.Tree

fun <A> depth(tree: Tree<A>): Int =
    when (tree) {
        is Leaf -> 0
        is Branch -> 1 + maxOf(depth(tree.left), depth(tree.right))
    }