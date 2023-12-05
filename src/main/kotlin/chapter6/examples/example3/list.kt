package chapter6.examples.example3

fun interface RandomGenerator {
    fun nextInt(): Pair<Int, RandomGenerator>
}