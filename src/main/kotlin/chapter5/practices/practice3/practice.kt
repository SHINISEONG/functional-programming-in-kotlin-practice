package chapter5.practices.practice3

import chapter5.examples.example2.Cons
import chapter5.examples.example2.Empty
import chapter5.examples.example2.Stream
import chapter5.examples.example2.Stream.Companion.cons

fun <A> Stream<A>.takeWhile(p: (A) -> Boolean): Stream<A> =
    when (this) {
        is Empty -> this
        is Cons ->
            if (p(head()))
                cons({ head() }, { tail().takeWhile(p) })
            else Empty
    }