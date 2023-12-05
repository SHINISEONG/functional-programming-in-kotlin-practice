package chapter5.practices.practice13

import chapter3.examples.list1.List
import chapter4.examples.example3.None
import chapter4.examples.example3.Some
import chapter5.examples.example2.Stream
import chapter5.practices.practice1.toList
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "mapFromUnfold 테스트" {
        Stream.of(1, 2, 3).mapFromUnfold { it * 2 }.toList() shouldBe List.of(2, 4, 6)
    }

    "takeFromUnfold 테스트" {
        Stream.of(1, 2, 3, 4, 5).takeFromUnfold(2).toList() shouldBe List.of(1, 2)
    }

    "takeWhileFromUnfold 테스트" {
        Stream.of(1, 2, 3, 4, 5).takeWhileFromUnfold { it < 4 }.toList() shouldBe List.of(1, 2, 3)
    }

    "zipWith 테스트" {
        Stream.of(1, 2, 3).zipWith(Stream.of(4, 5, 6)) { a, b -> a + b }.toList() shouldBe List.of(5, 7, 9)
    }

    "zipAll 테스트" {
        Stream.of(1, 2, 3).zipAll(Stream.of(1, 2, 3, 4)).toList() shouldBe
                List.of(
                    Some(1) to Some(1),
                    Some(2) to Some(2),
                    Some(3) to Some(3),
                    None to Some(4)
                )
    }
})