package chapter3.practices.practice10

import chapter3.examples.list1.List
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PracticeTest : StringSpec({
  "leftFoldSum" {
      foldLeftSum(List.of(1, 2, 3, 5)) shouldBe 11
  }
  "leftFoldProduct" {
      foldLeftProduct(List.of(1, 2, 3, 4)) shouldBe 24
  }
  "leftFoldLength" {
      foldLeftLength(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)) shouldBe 9
  }
})