package chapter5.practices.practice8

import chapter5.examples.example2.Stream

fun <A> constant(a: A): Stream<A> =
    Stream.cons({ a }) { constant(a) }