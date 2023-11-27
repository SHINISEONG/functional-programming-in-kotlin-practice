package chapter3.practices.practice9

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

tailrec fun <A, B> foldLeft(xs: List<A>, z: B, fn: (B, A) -> B): B =
    when (xs) {
        is Cons -> foldLeft(xs.tail, fn(z, xs.head), fn)
        is Nil -> z
    }

