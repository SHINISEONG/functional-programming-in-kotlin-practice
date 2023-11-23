package chapter3.practices.practice7

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list11.foldRight

fun <T> copy(list: List<T>): List<T> =
    foldRight(list, List.empty()) { x, y -> Cons(x, y) }