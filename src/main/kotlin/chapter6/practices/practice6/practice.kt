package chapter6.practices.practice6

import chapter6.examples.example7.Rand

fun <A, B, C> map2(
    randA: Rand<A>,
    randB: Rand<B>,
    fn: (A, B) -> C
): Rand<C> =
    { randomGenerator ->
        val (a, randomGenerator2) = randA(randomGenerator)
        val (b, randomGenerator3) = randB(randomGenerator2)
        fn(a, b) to randomGenerator3
    }