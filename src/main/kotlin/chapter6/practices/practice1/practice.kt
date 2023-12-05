package chapter6.practices.practice1

import chapter6.examples.example3.RandomGenerator

fun nonNegativeInt(randomGenerator: RandomGenerator): Pair<Int, RandomGenerator> {
    val (randomInt, randomGenerator2) = randomGenerator.nextInt()
    return (if (randomInt < 0) -(randomInt + 1) else randomInt) to randomGenerator2
}