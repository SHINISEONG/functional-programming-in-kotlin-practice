package chapter3.practices.practice13

import chapter3.examples.list1.Cons
import chapter3.examples.list11.foldRight
import chapter3.examples.list1.List
import chapter3.practices.practice9.foldLeft

fun <A> appendFromFoldRight(a1: List<A>, a2: List<A>): List<A> =
    foldRight(a1, a2) { a, b -> Cons(a, b) }

fun <A> appendFromFoldLeft(a1: List<A>, a2: List<A>): List<A> =
    foldLeft(a1,
        { xs: List<A> -> xs},
        { g, a ->
             { b ->
                 g(Cons(a, b))
             }
        }
    )(a2)