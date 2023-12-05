package chapter5.practices.practice12

import chapter4.examples.example3.Some
import chapter5.examples.example2.Stream
import chapter5.practices.practice11.unfold

fun onesFromUnfold(): Stream<Int> = unfold(1) { Some(1 to 1) }

fun <A> constantFromUnfold(n: A): Stream<A> = unfold(n) { Some(n to n) }

fun fromFromUnfold(n: Int): Stream<Int> = unfold(n) { s: Int -> Some(s to (s + 1)) }

fun fibsFromUnfold(): Stream<Int> =
    unfold(0 to 1) { (curr, next) ->
        Some(curr to (next to (curr + next)))
    }