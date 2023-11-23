package chapter3.practices.practice4

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

fun <A> dropWhile(l: List<A>, fn: (A) -> Boolean): List<A> = when(l) {
    is Cons -> if(fn(l.head)) dropWhile(l.tail, fn) else l
    is Nil -> l
}