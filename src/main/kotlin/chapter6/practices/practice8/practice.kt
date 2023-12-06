package chapter6.practices.practice8

import chapter6.examples.example7.Rand
import chapter6.examples.example8.unit
import chapter6.practices.practice1.nonNegativeInt

fun <A, B> flatMap(fn: Rand<A>, fn2: (A) -> Rand<B>): Rand<B> =
    { randomGenerator ->
        val (a, randomGenerator2) = fn(randomGenerator)
        fn2(a)(randomGenerator2)
    }

fun nonNegativeLesThanByFlatMap(n: Int): Rand<Int> =
    flatMap(::nonNegativeInt) { a ->
        val mod = a % n
        if (a + (n - 1) - mod >= 0) unit(mod)
        else nonNegativeLesThanByFlatMap(n)
    }

