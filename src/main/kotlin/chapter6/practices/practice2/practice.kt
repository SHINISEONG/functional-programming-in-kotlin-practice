package chapter6.practices.practice2

import chapter6.examples.example3.RandomGenerator
import chapter6.practices.practice1.nonNegativeInt

fun double(randomGenerator: RandomGenerator): Pair<Double, RandomGenerator> {
    val (randomInt, randomGenerator2) = nonNegativeInt(randomGenerator)
    return (randomInt / (Int.MAX_VALUE.toDouble() + 1)) to randomGenerator2
}