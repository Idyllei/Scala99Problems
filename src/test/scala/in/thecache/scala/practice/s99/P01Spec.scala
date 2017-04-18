package in.thecache.scala.practice.s99

import org.scalatest._


class P01Spec extends FlatSpec {

  "P01.last" should "return the last element of a list" in {

    val lst1 = List[Int](1, 2, 3, 4, 5)
    assert(P01.last(lst1) === 5)

    val lstStr = List[String]("My", "name", "is", "Paul")
    assert(P01.last(lstStr) === "Paul")
  }
}
