package in.thecache.scala.practice.s99

import org.scalatest.{AppendedClues, FlatSpec, GivenWhenThen, Matchers}

/**
  * Created by Spencer on 19-Apr-17.
  */
class P04Spec extends FlatSpec with Matchers with GivenWhenThen with AppendedClues {
  behavior of "P04.length"

  it must "return the length of a list" in {
    val lst = List[String]("Hello", "World!", "How", "are", "you?")

    assertResult(5) { P04.length(lst) }
  }

  it must "continue counting past nested Nils" in {
    Given("a list of lists")
    val lstLstInt = List[List[Int]](
      List[Int](0, 1, 2, 3, 4),
      Nil,  // List[Int]#Nil
      List[Int](5, 6, 7, 8, 9))
    val lstLstIntEndNil = List[List[Int]](
      List[Int](0, 1, 2, 3, 4),
      List[Int](5, 6, 7, 8, 9),
      Nil)

    When("it encounters Nil")

    Then("it continues as normal")
    assertResult(3) { P04.length(lstLstInt) }
    assertResult(3) { P04.length(lstLstIntEndNil) }
  }
}
