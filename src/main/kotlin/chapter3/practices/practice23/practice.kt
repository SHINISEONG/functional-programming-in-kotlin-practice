package chapter3.practices.practice23

import chapter3.examples.list1.Cons
import chapter3.examples.list1.List
import chapter3.examples.list1.Nil

tailrec fun <A> startsWith(list1: List<A>, list2: List<A>): Boolean =
    when (list1) {
        is Nil -> list2 == Nil
        is Cons -> when (list2) {
            is Nil -> true
            is Cons ->
                if(list1.head == list2.head)
                    startsWith(list1.tail, list2.tail)
                else false
        }
    }
tailrec fun <A> hasSubsequence(list: List<A>, sub: List<A>): Boolean =
    when (list) {
        is Nil -> false
        is Cons ->
            if (startsWith(list, sub))
                true
            else
                hasSubsequence(list.tail, sub)
    }
