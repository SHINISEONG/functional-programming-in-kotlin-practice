package chapter6.examples.example4

import io.kotest.core.spec.style.StringSpec

class ListTest : StringSpec({
    "test" {
        val rng = SimpleRandomGenerator(42)
        val (n1, rng2) = rng.nextInt()
        val (n2, rng3) = rng2.nextInt()
        println("n1 : $n1, rng2 : $rng2")
        println("n2 : $n2, rng3 : $rng3")
    }
})