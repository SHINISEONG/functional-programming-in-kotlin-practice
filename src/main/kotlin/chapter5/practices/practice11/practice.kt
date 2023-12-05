package chapter5.practices.practice11

import chapter4.examples.example3.Option
import chapter4.practices.pracitce1.getOrElse
import chapter4.practices.pracitce1.map
import chapter5.examples.example2.Stream
import chapter5.examples.example2.Stream.Companion.cons
import chapter5.examples.example2.Stream.Companion.empty

fun <A, S> unfold(initial: S, fn: (S) -> Option<Pair<A, S>>): Stream<A> =
    fn(initial).map { pair ->
        cons({ pair.first }) { unfold(pair.second, fn) }
    }.getOrElse { empty() }