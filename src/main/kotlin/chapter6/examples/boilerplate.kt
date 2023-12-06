package chapter6.examples

import chapter6.examples.example3.RandomGenerator
import chapter6.examples.example7.Rand
import chapter6.practices.practice6.map2

val randomGenerator1 = object : RandomGenerator {
    override fun nextInt() = 1 to this
}

val randomGeneratorMock = RandomGenerator { TODO() }
val randomGeneratorMax = RandomGenerator { Int.MAX_VALUE to randomGeneratorMock }
const val BELOW_ONE = Int.MAX_VALUE / (Int.MAX_VALUE.toDouble() + 1)

data class MaxRandomGenerator(val seed: Int = Int.MAX_VALUE) : RandomGenerator {
    override fun nextInt(): Pair<Int, RandomGenerator> {
        val nextRNG = MaxRandomGenerator(Int.MAX_VALUE)
        val n = seed
        return n to nextRNG
    }
}

fun <A, B> both(
    randomA: Rand<A>,
    randomB: Rand<B>
): Rand<Pair<A, B>> =
    map2(randomA, randomB) { a, b -> a to b }