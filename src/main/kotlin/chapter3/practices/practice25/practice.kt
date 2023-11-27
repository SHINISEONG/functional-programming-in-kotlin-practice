package chapter3.practices.practice25

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import chapter3.examples.list12.Tree

fun maximum(tree: Tree<Int>): Int =
    when (tree) {
        is Leaf -> tree.value
        is Branch -> maxOf( maximum(tree.left), maximum(tree.right) )
    }
