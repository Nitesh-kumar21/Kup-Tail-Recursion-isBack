package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class listLengthTest extends AnyFunSuite {

  val listLength = new FindLength

  test("check the condition if there is a Int type List") {
    assert(listLength.recursiveLength(List(1, 2, 3, 4, 6, 7, 7)) == 7)
  }
  test("check the condition if there is no element in the list") {
    assert(listLength.recursiveLength(List()) == 0)
  }
  test("check if the list contain string data type") {
    assert(listLength.recursiveLength(List("hello", "hi", "bye", "bye")) == 4)
  }
  test("Calculate the length of Seq") {
    assert(listLength.recursiveLength(Seq(1, 2, 3, 4, 5)) == 5)
  }
  test("Calculate the length of Sequence if their is nothing given") {
    assert(listLength.recursiveLength(Seq()) == 0)
  }
  test("check if the input in Sequence is String") {
    assert(listLength.recursiveLength(Seq("hello", "Is", " it", " a", "String")) == 5)
  }
  test("calculate the length of Set") {
    assert(listLength.recursiveLength(Set('a', 'b', 'c', 'd')) == 4)
  }
  test("calculate the Set length of Int data type") {
    assert(listLength.recursiveLength(Set(1, 2, 3, 4, 5, 6, 7, 8, 9)) == 9)
  }
  test("check weather Set is empty") {
    assert(listLength.recursiveLength(Set()) == 0)
  }

}

