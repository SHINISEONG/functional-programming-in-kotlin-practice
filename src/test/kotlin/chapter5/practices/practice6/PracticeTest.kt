package chapter5.practices.practice6

import chapter4.examples.example3.None
import chapter4.examples.example3.Some
import chapter5.examples.example2.Stream
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "headOptionFromFoldRight 테스트" {
        Stream.of(1, 2, 3).headOptionFromFoldRight() shouldBe Some(1)
        Stream.empty<Int>().headOptionFromFoldRight() shouldBe None
    }
})