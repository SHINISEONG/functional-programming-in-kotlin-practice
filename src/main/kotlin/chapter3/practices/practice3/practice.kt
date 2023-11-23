package chapter3.practices.practice3

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

fun <A> drop(l: List<A>, n: Int): List<A> = when(l) {
        is Cons -> if (n == 1) l.tail else drop(l.tail, n - 1)
        is Nil -> l
    }
