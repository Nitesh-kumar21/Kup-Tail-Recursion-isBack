package com.knoldus

import scala.annotation.tailrec

class FindLength {
  @tailrec
  final def recursiveLength[A](combination: Iterable[A], accumulator: Int = 0): Int = {
    if (combination.isEmpty) accumulator
    else recursiveLength(combination.tail, accumulator + 1)
  }

}
