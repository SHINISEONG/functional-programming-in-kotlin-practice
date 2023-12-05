package chapter5.practices.practice4

import chapter5.examples.example2.Stream.Companion.of
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
    "forAll 테스트" {
        of(1, 2, 3).forAll { it < 4 } shouldBe true
    }
})