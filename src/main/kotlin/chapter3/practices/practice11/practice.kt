package chapter3.practices.practice11

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.examples.list11.foldRight
import chapter3.practices.practice9.foldLeft

fun <T> reverse(xs: List<T>): List<T> =
    foldLeft(xs, List.empty()){ x, y -> Cons(y, x) }