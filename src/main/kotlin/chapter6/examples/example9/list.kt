package chapter6.examples.example9

import chapter6.examples.example7.Rand
import chapter6.practices.practice1.nonNegativeInt

fun <A, B> map(s: Rand<A>, f: (A) -> B): Rand<B> =
    { randomGenerator ->
        val (a, rng2) = s(randomGenerator)
        f(a) to rng2
    }

fun nonNegativeEven(): Rand<Int> =
    map(::nonNegativeInt) { it - (it % 2) }
