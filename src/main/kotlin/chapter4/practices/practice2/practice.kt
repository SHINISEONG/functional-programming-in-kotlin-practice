package chapter4.practices.practice2

import chapter4.examples.example2.mean
import chapter4.examples.example3.None
import chapter4.examples.example3.Option
import chapter4.practices.pracitce1.flatMap
import chapter4.practices.pracitce1.getOrElse
import kotlin.math.pow

fun variance(list: List<Double>): Option<Double> =
    mean(list).flatMap { m ->
        mean( list.map{ x ->
            ( x - m ).pow( 2 )
        })
    }