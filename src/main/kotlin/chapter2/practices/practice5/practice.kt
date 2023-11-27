package chapter2.practices.practice5

fun <A, B, C> compose(fn1: (B) -> C, fn2: (A) -> B): (A) -> C =
    { a -> fn1(fn2(a)) }