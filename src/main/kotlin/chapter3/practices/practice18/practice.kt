package chapter3.practices.practice18

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.practices.practice12.foldRightFromFoldLeft
import chapter3.practices.practice17.map

fun <A> filter(list: List<A>, fn:(A) -> Boolean): List<A> =
    when(list) {
        is Nil -> list
        is Cons -> if (fn(list.head)) Cons(list.head, filter(list.tail, fn)) else filter(list.tail, fn)
    }

fun <A> filterFromFoldRight(list: List<A>, fn: (A) -> Boolean): List<A> =
    foldRightFromFoldLeft(
        list,
        List.empty()
    ) { a, b ->
        if(fn(a)) Cons(a, b) else b
    }