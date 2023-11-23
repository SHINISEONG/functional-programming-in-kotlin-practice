package chapter3.practices.practice10

import chapter3.examples.list1.List
import chapter3.practices.practice9.foldLeft

fun foldLeftSum(xs: List<Int>): Int =
    foldLeft(xs, 0) {y, x -> y + x}

fun foldLeftProduct(xs: List<Int>): Int =
    foldLeft(xs, 1) {y, x -> y * x}

fun <T> foldLeftLength(xs: List<T>): Int =
    foldLeft(xs, 0){acc, _ -> acc + 1}