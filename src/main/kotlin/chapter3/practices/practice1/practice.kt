package chapter3.practices.practice1

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

fun <A> tail(list: List<A>): List<A> = when(list) {
    is Nil -> list
    is Cons<A> -> list.tail
}