package chapter5.practices.practice5

import chapter5.examples.example2.Stream
import chapter5.examples.example2.Stream.Companion.cons
import chapter5.examples.example2.Stream.Companion.empty

fun <A> Stream<A>.takeWhileFromFoldRight(p: (A) -> Boolean): Stream<A> =
    foldRight({ empty() }) { a, b ->
        if (p(a))
            cons({ a }, b)
        else
            empty()
    }

