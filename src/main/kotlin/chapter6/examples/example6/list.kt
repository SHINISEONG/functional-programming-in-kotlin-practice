package chapter6.examples.example6

import chapter6.examples.example3.RandomGenerator

fun randomPair2(randomGenerator: RandomGenerator): Pair<Pair<Int, Int>, RandomGenerator> {
    val (randomInt1, randomGenerator2) = randomGenerator.nextInt()
    val (randomInt2, randomGenerator3) = randomGenerator2.nextInt()
    return (randomInt1 to randomInt2) to randomGenerator3
}