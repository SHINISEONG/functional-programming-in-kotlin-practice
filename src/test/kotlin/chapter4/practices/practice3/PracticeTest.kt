package chapter4.practices.practice3

import chapter4.examples.example3.None
import chapter4.examples.example3.Some
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "map2 Test" {
        map2(Some(10), Some(10)) { a, b ->
            "${a.toString()}${b.toString()}"
        } shouldBe Some("1010")
    }
    "map2 Test 2" {
        map2(Some(10), None) { a, b ->
            "${a.toString()}${b.toString()}"
        } shouldBe None
    }
})