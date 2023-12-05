package chapter6.practices.practice3

import chapter6.examples.example3.RandomGenerator
import chapter6.practices.practice1.nonNegativeInt
import chapter6.practices.practice2.double

fun intDouble(randomGenerator: RandomGenerator): Pair<Pair<Int, Double>, RandomGenerator> {
    val (randomInt, randomGenerator2) = nonNegativeInt(randomGenerator)
    val (randomDouble, randomGenerator3) = double(randomGenerator2)
    return (randomInt to randomDouble) to randomGenerator3
}

fun doubleInt(randomGenerator: RandomGenerator): Pair<Pair<Double, Int>, RandomGenerator> {
    val (randomDouble, randomGenerator2) = double(randomGenerator)
    val (randomInt, randomGenerator3) = nonNegativeInt(randomGenerator2)
    return (randomDouble to randomInt) to randomGenerator3
}

fun double3(randomGenerator: RandomGenerator): Pair<Triple<Double, Double, Double>, RandomGenerator> {
    val (randomDouble1, randomGenerator2) = double(randomGenerator)
    val (randomDouble2, randomGenerator3) = double(randomGenerator2)
    val (randomDouble3, randomGenerator4) = double(randomGenerator3)
    return Triple(randomDouble1, randomDouble2, randomDouble3) to randomGenerator4
}


