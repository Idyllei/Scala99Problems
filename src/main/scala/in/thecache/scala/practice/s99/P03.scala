package in.thecache.scala.practice.s99

/**
  * Created by Spencer on 18-Apr-17.
  */
object P03 {
  def nth[A](lst: List[A], n: Int): A = {
    def nthWithCount(lst: List[A], n: Int, idx: Int): A = lst match {
      case x :: _ if idx == n => x
      case _ :: xs => nthWithCount(xs, n, idx + 1)
      case _ => throw new NoSuchElementException
    }
    if (n < 0) throw new NoSuchElementException
    nthWithCount(lst, n, 0)
  }

  def nthBetter[A](lst: List[A], n: Int): A = {
    /**
      *
      * @param n the index of the desired element
      * @param lst the list holding the element to be fetched
      * @return the `n`th element (of type `A`) in `lst`
      */
    def nthRecursive(n: Int, lst: List[A]): A = (n, lst) match {
      case (0, x :: _ ) =>
        // We are at the n-th element.
        x
      case (c, _ :: xs) =>
        // we are 1 element closer to the n-th element; repeat on the remaining
        // list.
        nthRecursive(c - 1, xs)
      case (_, Nil) => // End of list.
        // End of list reached.
        // This replaces the `case _ => ...` of `nthWithCount` and
        // the `(n < 0)` check of `nth`.
        throw new NoSuchElementException
    }

    nthRecursive(n, lst)
  }
}
