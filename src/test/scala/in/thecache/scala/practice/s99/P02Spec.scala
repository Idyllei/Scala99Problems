package in.thecache.scala.practice.s99

import org.scalatest._

/**
  * Created by Spencer on 18-Apr-17.
  */
class P02Spec extends FlatSpec {
  "P02.penultimate" should "return the second-to last element of an array" in {
    val lstInt = List[Int](1, 2, 3, 4, 5)
    assert(P02.penultimate(lstInt) === 4)

    val lstStr = List[String]("Hello", "world", "how", "are", "you?")
    assert(P02.penultimate(lstStr) === "are")
  }
}
