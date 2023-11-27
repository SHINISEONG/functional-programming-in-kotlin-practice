package chapter3.practices.practice14

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil
import chapter3.examples.list11.foldRight
import chapter3.practices.practice11.reverse
import chapter3.practices.practice13.appendFromFoldLeft
import chapter3.practices.practice9.foldLeft

fun <A> combine(lists: List<List<A>>): List<A> =
    when (lists) {
        is Nil -> List.empty()
        is Cons -> appendFromFoldLeft(lists.head, combine(lists.tail))
    }

fun <A> concatFromFoldRight(lists: List<List<A>>): List<A> =
    foldRight(
        lists,
        List.empty()
    ){ list1, list2 ->
        foldRight(list1, list2) { a, b ->
            Cons(a, b)
        }
    }

fun <A> concatFromFoldLeft(lists: List<List<A>>): List<A> =
    foldLeft(
        lists,
        List.empty()
    ) {list1, list2 ->
        foldLeft(reverse(list1), list2) { a, b ->
            Cons(b, a)
        }
    }