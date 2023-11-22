package chapter2.practices.practice4

fun <A, B, C> uncurry(fn: (A) -> (B) -> C): (A, B) -> C =
    { a, b -> fn(a)(b) }