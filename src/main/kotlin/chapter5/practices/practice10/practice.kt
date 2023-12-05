package chapter5.practices.practice10

import chapter5.examples.example2.Stream
import chapter5.examples.example2.Stream.Companion.cons

fun fibs(): Stream<Int> {
    fun go(curr: Int, next: Int): Stream<Int> =
        cons({ curr }) { go(next, curr + next) }
    return go(0, 1)
}
