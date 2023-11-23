package chapter3.practices.practice2

import chapter3.examples.list1.List
import chapter3.examples.list1.Cons
import chapter3.examples.list1.Nil

fun <A> setHead(xs: List<A>, x: A): List<A> = when (xs) {
    is Nil -> Cons(x, Nil)
    is Cons<A> -> Cons(x, xs.tail)
}