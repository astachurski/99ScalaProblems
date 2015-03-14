/**
 * Created by adrian on 2/18/2015.
 */

/*
Find the Kth element of a list.
  By convention, the first element in the list is element 0.

Example:

  scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2

*/

object P03 extends App {

  def nth1[A](elemIdx: Int, list: List[A]): A = {

    list(elemIdx)

  }

  def nth2[A](elemIdx: Int, list: List[A]): A = {

    def temp(l:List[A], currIdx:Int): A = l match {

      case head::tail if elemIdx != currIdx => temp(tail,currIdx + 1)
      case head::tail if elemIdx == currIdx => head
      case head::Nil => head

    }

    temp(list, 0)


  }


  println(nth1(2, List(1, 1, 2, 3, 5, 8)))

  println(nth2(2, List(1, 1, 2, 3, 5, 8)))

  println(nth1(4, List(1, 1, 2, 3, 5, 8)))

  println(nth2(4, List(1, 1, 2, 3, 5, 8)))


}
