package chapter3.practices.practice16

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.practices.practice11.reverse
import chapter3.practices.practice12.foldRightFromFoldLeft
import chapter3.practices.practice9.foldLeft

fun doubleListToString(list: List<Double>): List<String> =
    foldRightFromFoldLeft(
        list,
        List.empty()
    ) { a, b ->
        Cons(a.toString(), b)
    }
