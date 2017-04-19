package in.thecache.scala.practice.s99

/**
  * Created by Spencer on 19-Apr-17.
  */
object P04 {
  def length[A](lst: List[A]): Int = {
    def lengthRecursive(lst: List[A], n: Int = 0): Int = lst match {
      case _ :: xs => lengthRecursive(xs, n + 1)
      case Nil => n
    }

    lengthRecursive(lst)
  }
}
