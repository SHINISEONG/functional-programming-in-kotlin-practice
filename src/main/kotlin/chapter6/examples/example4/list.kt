package chapter6.examples.example4

import chapter6.examples.example3.RandomGenerator

data class SimpleRandomGenerator(val seed: Long) : RandomGenerator {
    override fun nextInt(): Pair<Int, RandomGenerator> {
        val newSeed = (seed * 0x5DEECE66DL + 0xBL) and
                0xFFFFFFFFFFFFL
        val nextRNG = SimpleRandomGenerator(newSeed)
        val n = (newSeed ushr 16).toInt()
        return n to nextRNG
    }
}