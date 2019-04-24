package io.samritchie.interview

/**
  * Goofing around with some scala to get the build set up.
  */
object CubeCalculator {
  case class Digits(toList: List[Int]) {
    def reverse: Digits = Digits(toList.reverse)
  }

  def sum(digits: Digits): Int =
    digits.toList.foldLeft(0)(_ + _)
}
