package chapter3.practices.practice5

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

fun <A> init(l: List<A>): List<A> =
    when(l) {
        is Cons -> if(l.tail !is Nil) Cons(l.head, init(l.tail)) else Nil
        is Nil -> l
    }
