package chapter4.examples.example2

import chapter4.examples.example3.None
import chapter4.examples.example3.Option
import chapter4.examples.example3.Some

fun mean(list: List<Double>): Option<Double> =
    if (list.isEmpty()) None
    else Some(list.sum() / list.size)