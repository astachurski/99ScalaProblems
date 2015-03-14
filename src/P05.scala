/*
Reverse a list.
  Example:

  scala> reverse(List(1, 1, 2, 3, 5, 8))

  res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/

object P05 extends App {

  def reverse0[A](list: List[A]): List[A] = {
    list.reverse

  }


  def reverse[A](list: List[A]): List[A] = {

    def revme(list: List[A], accList: List[A]): List[A] = list match {
      case head :: tail => revme(tail, head :: accList)
      case Nil => accList
    }

    revme(list, Nil)

  }


  println(reverse0(List(1, 1, 2, 3, 5, 8)))

  println(reverse(List(1, 1, 2, 3, 5, 8)))

  println(reverse(List("Sraka", "ptaka", "nieboraka", "gugu")))

}
