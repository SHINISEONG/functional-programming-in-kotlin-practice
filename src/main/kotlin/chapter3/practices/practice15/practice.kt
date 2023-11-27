package chapter3.practices.practice15

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.practices.practice11.reverse
import chapter3.practices.practice9.foldLeft

fun plusOne(list: List<Int>): List<Int> =
    foldLeft(reverse(list), List.empty()) { b, a ->
        Cons(a + 1, b)
    }