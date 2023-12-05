package chapter5.practices.practice4

import chapter5.examples.example2.Stream

fun <A> Stream<A>.forAll(p: (A) -> Boolean): Boolean =
    foldRight(
        { true },
        { a, b ->
            p(a) && b()
        }
    )