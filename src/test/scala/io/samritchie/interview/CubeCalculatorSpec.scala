package io.samritchie.interview

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object CubeCalculatorSpec extends Properties("CubeCalculator") {
  property("sum equals reverse sum") = forAll { (ints: List[Int]) =>
    val digits = CubeCalculator.Digits(ints)
    CubeCalculator.sum(digits) == CubeCalculator.sum(digits.reverse)
  }
}


class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("CubeCalculator.cube") {
    val digits = CubeCalculator.Digits(List(1,2,3))
    assert(CubeCalculator.sum(digits) === 6)
  }
}
