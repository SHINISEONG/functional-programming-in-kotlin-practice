package chapter6.practices.practice5

import chapter6.examples.example7.Rand
import chapter6.examples.example9.map
import chapter6.practices.practice1.nonNegativeInt

fun doubleR(): Rand<Double> =
    map(::nonNegativeInt) { it / (Int.MAX_VALUE.toDouble() + 1) }