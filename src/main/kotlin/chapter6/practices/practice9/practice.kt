package chapter6.practices.practice9

import chapter6.examples.example7.Rand
import chapter6.examples.example8.unit
import chapter6.practices.practice8.flatMap

fun <A, B> mapByFlatMap(randA: Rand<A>, fn: (A) -> B): Rand<B> =
    flatMap(randA) { a -> unit(fn(a)) }

fun <A, B, C> map2ByFlatMap(
    randA: Rand<A>,
    randB: Rand<B>,
    fn: (A, B) -> C
): Rand<C> =
    flatMap(randA) { a ->
        mapByFlatMap(randB) { b ->
            fn(a, b)
        }
    }