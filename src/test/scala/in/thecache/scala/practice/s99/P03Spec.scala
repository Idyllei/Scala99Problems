package in.thecache.scala.practice.s99

import java.util.NoSuchElementException

import org.scalatest._

/**
  * Created by Spencer on 18-Apr-17.
  */
class P03Spec extends FlatSpec {

  private def lstInt = List[Int](0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  behavior of "P03.nth"

  it should "get the nth element of a list" in {
    val lst = lstInt
    assert(P03.nth(lst, 4) === 4)
  }

  it should "throw a NoSuchElementException when given index > length of list" in {
    val lst = lstInt
    assertThrows[NoSuchElementException] {
      P03.nth(lst, 11)
    }
  }

  it should "throw a NoSuchElementException when given a negative index" in {
    val lst = lstInt
    assertThrows[NoSuchElementException] {
      P03.nth(lst, -1)
    }
  }

  behavior of "P03.nthBetter"

  it should "get the nth element of a list" in {
    val lst = lstInt
    assert(P03.nthBetter(lst, 4) === 4)
  }

  it should "throw a NoSuchElementException when given index > length of list" in {
    val lst = lstInt
    assertThrows[NoSuchElementException] {
      P03.nthBetter(lst, 11)
    }
  }

  it should "throw a NoSuchElementException when given index < 0" in {
    assertThrows[NoSuchElementException] {
      val lst = lstInt
      P03.nthBetter(lst, -1)
    }
  }

}
