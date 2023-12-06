package chapter6.practices.practice7

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.examples.list11.foldRight
import chapter6.examples.example3.RandomGenerator
import chapter6.examples.example7.Rand
import chapter6.examples.example8.unit
import chapter6.practices.practice6.map2

fun <A> sequence(fns: List<Rand<A>>): Rand<List<A>> =
    { randomGenerator ->
        when (fns) {
            is Nil -> unit(List.empty<A>())(randomGenerator)
            is Cons -> {
                val (a, randomGenerator2) = fns.head(randomGenerator)
                val (b, randomGenerator3) = sequence(fns.tail)(randomGenerator2)
                Cons(a, b) to randomGenerator3
            }
        }
    }

fun <A> sequenceFromFoldRight(fns: List<Rand<A>>): Rand<List<A>> =
    foldRight(fns, unit(List.empty<A>())) { randA, randList ->
        map2(randA, randList) { a, list -> Cons(a, list) }
    }

fun intsFromSequence(count: Int, randomGenerator: RandomGenerator): Pair<List<Int>, RandomGenerator> {
    fun go(count: Int): List<Rand<Int>> =
        if (count == 0) List.empty()
        else Cons({ randomGenerator -> randomGenerator.nextInt() }, go(count - 1))
    return sequenceFromFoldRight(go(count))(randomGenerator)
}