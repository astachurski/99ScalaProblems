
/*
(**) Flatten a nested list structure.
Example:

  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
*/

object P07 extends App {

  def flatten1[A](xs: List[List[A]]): List[A] =
    (xs :\ (Nil: List[A])) { (x, xs) => x ::: xs}

  def flatten[A](list: List[A]): List[A] = {

    def temp(list: List[A], acc: List[A]): List[A] = list match {

      case head :: Nil => head :: acc
      case head if head.isInstanceOf[List[A]] => println(s"in [List() :: tail],  head: $head, tail: ${list.tail.toString()}\n"); flatten(head.tail):::acc
      case head :: tail => println(s"in [head::tail], head: $head, tail: $tail\n"); temp(tail, head :: acc)
      case Nil => acc


    }


    temp(list, Nil)
  }


  val ar = List(List(1, 2), 3, List(4, List(5, 6)))


  println("flatten list: " + flatten(ar))
  // println("flatten list: " + flatten1(ar))

}
