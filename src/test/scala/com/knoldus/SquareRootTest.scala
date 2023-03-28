package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class SquareRootTest extends AnyFlatSpec {
  val squareRoot = new SquareRoot

  it should "return a list of Integers after finding the square root " in {
    val actualResult = squareRoot.findSquareRoot(List(4, 16, 25, 9, 625))
    val expectedResult = List(2, 4, 5, 3, 25)
    assert(actualResult == expectedResult)
  }

  it should "throw an IllegalArgumentException" in {
    an[IllegalArgumentException] should be thrownBy {
      squareRoot.findSquareRoot(List(-4, -16, 25, 9, 625))
    }
  }
}
