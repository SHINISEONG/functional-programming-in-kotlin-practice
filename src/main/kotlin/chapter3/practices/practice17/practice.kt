package chapter3.practices.practice17

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.practices.practice11.reverse
import chapter3.practices.practice9.foldLeft

fun <A> map(list: List<A>, fn: (A) -> A ): List<A> =
    foldLeft(
        reverse(list),
        List.empty()
    ) { b, a ->
        Cons(fn(a), b)
    }