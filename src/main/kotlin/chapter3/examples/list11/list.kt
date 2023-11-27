package chapter3.examples.list11

import chapter3.examples.list1.Cons
import chapter3.examples.list1.Nil
import chapter3.examples.list1.List

fun <A, B> foldRight(xs: List<A>, z: B, fn: (A, B) -> B): B =
    when (xs) {
        is Nil -> z
        is Cons -> fn(xs.head, foldRight(xs.tail, z, fn))
    }