package chapter2.practices.practice3

fun <A, B, C> curry(fn: (A, B) -> C): (A) -> (B) -> C =
    { a -> { b -> fn(a, b) } }