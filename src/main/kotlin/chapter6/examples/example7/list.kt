package chapter6.examples.example7

import chapter6.examples.example3.RandomGenerator

typealias Rand<A> = (RandomGenerator) -> Pair<A, RandomGenerator>

val intR: Rand<Int> = { rng -> rng.nextInt() }
