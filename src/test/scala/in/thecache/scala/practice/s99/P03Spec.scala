package in.thecache.scala.practice.s99

import java.util.NoSuchElementException

import org.scalatest._

/**
  * Created by Spencer on 18-Apr-17.
  */
class P03Spec extends FlatSpec with Matchers with GivenWhenThen with AppendedClues {

  private def lstInt = List[Int](0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  behavior of "P03.nth"

  it must "return the nth element of a list" in {
    Given("a list whose fifth element (index = 4) is 4")
    val lst = lstInt

    When("nth is called with an index of 4 (meaning the fifth element)")

    Then("the result is 4")
    assert(P03.nth(lst, 4) === 4)
  }

  it must "throw an exception when the index is larger than the largest valid index of the list" in {
    Given("a list and an index")
    val lst = lstInt
    val invalidIndex = lst.last + 1 // lst.length

    When("the index is greater than the largest valid index")

    Then("an exception is thrown")
    a [NoSuchElementException] should be thrownBy {
      P03.nth(lst, invalidIndex)
    } withClue (s"; P03.nth was given a list with length ${lst.length}"
        + s" (this means it had a last valid index of ${lst.last},"
        + s" and an index of $invalidIndex")
  }

  it must "throw an exception when the index is negative" in {
    Given("a list and a index")
    val lst = lstInt
    val invalidIndex = -1

    When("the index is negative")

    Then("an exception is thrown")
    a [NoSuchElementException] should be thrownBy {
      P03.nth(lst, invalidIndex)
    } withClue (s"; P03.nth was given a list of length ${lst.length}"
        + s" and an index of $invalidIndex")
  }

  behavior of "P03.nthBetter"

  it must "return the nth element of a list" in {
    Given("a list with a fifth element (index = 4) of 4")
    val lst = lstInt

    When("P0.nthBetter is called with an index of 4")
    val index = 4

    Then("the result is 4")
    assert(P03.nthBetter(lst, index) === 4)
  }

  it must "throw an exception when the index is greater than the largest valid index of the list" in {
    Given("a list of length n and and index")
    val lst = lstInt

    When("the index is greater than the last valid index (e.g., idx > n - 1)")
    val invalidIndex = lst.last + 1

    Then("an exception is thrown")
    a [NoSuchElementException] should be thrownBy {
      P03.nthBetter(lst, invalidIndex)
    } withClue (s"; the last valid index of the list was ${lst.last}"
      + s" but the requested index was $invalidIndex.")
  }

  it must "throw an exception when the index is negative" in {
    Given("a list and an index")
    val lst = lstInt

    When("the index is negative")
    val invalidIndex = -1

    Then("an exception is thrown")
    a [NoSuchElementException] should be thrownBy {
      P03.nthBetter(lst, invalidIndex)
    } withClue (s"; the requested index was $invalidIndex")
  }
}
