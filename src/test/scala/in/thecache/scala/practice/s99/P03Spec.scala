package in.thecache.scala.practice.s99

import java.util.NoSuchElementException

import org.scalatest._

/**
  * Created by Spencer on 18-Apr-17.
  */
class P03Spec extends FlatSpec {
  behavior of "P03.nth"

  it should "get the nth element of a list" in {
    val lstInt = List[Int](0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(P03.nth(lstInt, 4) === 4)
  }

  it should "thrown a NoSuchElementException when given index > length of list" in {
    val lstInt = List[Int](1, 2, 3, 4, 5)
    assertThrows[NoSuchElementException] {
      P03.nth(lstInt, 5)
    }
  }

  it should "throw a NoSuchElementException when given a negative index" in {
    val lstInt = List[Int](1, 2, 3, 4, 5)
    assertThrows[NoSuchElementException] {
      P03.nth(lstInt, -1)
    }
  }
}
