package chapter3.practices.practice21

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.practices.practice12.foldRightFromFoldLeft

fun zipPlus(aList: List<Int>, bList: List<Int>): List<Int> =
    when (aList) {
        is Nil -> List.empty()
        is Cons -> when (bList) {
            is Nil -> List.empty()
            is Cons -> Cons(aList.head + bList.head, zipPlus(aList.tail, bList.tail))
        }
    }
