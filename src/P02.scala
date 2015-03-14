/**
 * Created by adrian on 2/18/2015.
 */
/*
find the last but one element of a list.
  Example:

  scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
*/
object P02 extends App {

  def penultimate[A](list: List[A]): A = {

    if (list.nonEmpty)
      list.reverse.tail.head
    else
      throw new NullPointerException

  }


  println(penultimate(List(1, 1, 2, 3, 5, 8)))

  val a2 = List("Sraka","ptaka", "nieboraka")

  println(penultimate(a2))

  println(penultimate(Nil))

}
