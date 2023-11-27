package chapter3.practices.practice22

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

fun <A> zipWith(list1: List<A>, list2: List<A>, fn: (A, A) -> A): List<A> =
    when (list1) {
        is Nil -> List.empty()
        is Cons -> when (list2) {
            is Nil -> List.empty()
            is Cons -> Cons(fn(list1.head, list2.head), zipWith(list1.tail, list2.tail, fn))
        }
    }