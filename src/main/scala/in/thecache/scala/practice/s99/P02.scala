package in.thecache.scala.practice.s99

/**
  * Created by Spencer on 18-Apr-17.
  */
object P02 {
  def penultimate[A](lst: List[A]): A = lst match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException
  }
}
