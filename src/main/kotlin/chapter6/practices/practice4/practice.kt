package chapter6.practices.practice4

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter6.examples.example3.RandomGenerator

fun ints(count: Int, randomGenerator: RandomGenerator): Pair<List<Int>, RandomGenerator> {
    tailrec fun go(count: Int, randomGenerator: RandomGenerator, acc: List<Int>): Pair<List<Int>, RandomGenerator> =
        when (count) {
            0 -> acc to randomGenerator
            else -> {
                val (randomInt, randomGenerator2) = randomGenerator.nextInt()
                go(count - 1, randomGenerator2, Cons(randomInt, acc))
            }
        }

    return go(count, randomGenerator, List.empty())
}