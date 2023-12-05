package chapter5.practices.practice16

import chapter5.examples.example2.Stream

fun <A, B> Stream<A>.scanRight(z: B, f: (A, () -> B) -> B): Stream<B> =
    foldRight({ z to Stream.of(z) }) { a: A, p0: () -> Pair<B, Stream<B>> ->
        val p1: Pair<B, Stream<B>> by lazy { p0() }
        val b2: B = f(a) { p1.first }
        Pair<B, Stream<B>>(b2, Stream.cons({ b2 }, { p1.second }))
    }.second
