package chapter5.practices.practice14

import chapter5.examples.example2.Stream
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "startWith 테스트" {
        Stream.of(1, 2, 3).startWith(Stream.of(1, 2)) shouldBe true
        Stream.of(1, 2, 3).startWith(Stream.of(2, 3)) shouldBe false
    }
})