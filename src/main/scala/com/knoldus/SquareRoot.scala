package com.knoldus

import scala.math.sqrt

class SquareRoot {
  def findSquareRoot(list: List[Long]): List[Long] = {
    list.map(
      value => if (value < 0) throw new IllegalArgumentException("cannot find square root of negative numbers ")
      else sqrt(value).toLong)
  }
}
