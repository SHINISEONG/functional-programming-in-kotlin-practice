package chapter5.practices.practice9

import chapter5.examples.example2.Stream

fun from(n: Int): Stream<Int> =
    Stream.cons({ n }) { from(n + 1) }