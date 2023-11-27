package chapter3.practices.practice28

import chapter3.examples.list12.Branch
import chapter3.examples.list12.Leaf
import chapter3.examples.list12.Tree

fun <A, B> fold(aTree: Tree<A>, l: (A) -> B, b: (B, B) -> B): B =
    when(aTree) {
        is Leaf -> l(aTree.value)
        is Branch -> b(
            fold(aTree.left, l, b),
            fold(aTree.right, l, b)
        )
    }

fun <A> sizeF(tree: Tree<A>): Int =
    fold(tree, { 1 }) { l, r -> 1 + l + r }

fun maximumF(intTree: Tree<Int>): Int =
    fold(
        intTree,
        { a -> a }
    ) { l, r -> maxOf(l, r)}

fun <A> depthF(tree: Tree<A>): Int =
    fold(
        tree,
        { 0 },
        { l, r -> 1 + maxOf(l, r) }
    )

fun <A, B> mapF(tree: Tree<A>, fn: (A) -> B): Tree<B> =
    fold(
        tree,
        { Leaf(fn(it))} ,
        { l: Tree<B>, r: Tree<B> ->
            Branch(l, r)
        }
    )