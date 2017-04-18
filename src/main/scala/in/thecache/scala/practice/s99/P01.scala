package in.thecache.scala.practice.s99

import scala.reflect.ClassTag

/**
  * Created by Spencer on 18-Apr-17.
  */
object P01 {
  def last[A](lst: List[A]): A = lst match {
    case x :: Nil => x
    case _ :: rest => last(rest)
    case _ => throw new NoSuchElementException
  }
}
