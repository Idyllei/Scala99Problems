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
}
