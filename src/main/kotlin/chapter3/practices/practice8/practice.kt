package chapter3.practices.practice8

import chapter3.examples.list1.Cons
import chapter3.examples.list11.foldRight
import chapter3.examples.list1.List
import chapter3.examples.list1.List.Companion.sum
import chapter3.examples.list1.Nil

fun <A> length(xs: List<A>): Int =
    foldRight(xs, 0) { _, acc -> 1 + acc }

