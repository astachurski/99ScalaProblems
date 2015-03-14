/*Find the number of elements of a list.
Example:

  scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6*/
object P04 extends App {


  def length[A](list: List[A]): Int = {

    list.foldLeft(0)((acc, x) => acc + 1)

  }

  def length2[A](list: List[A]): Int = {

    def recurse(list: List[A], acc: Int): Int = list match {
      case head :: tail => recurse(tail, acc + 1)
      case Nil => acc
    }

    recurse(list, 0)

  }


  println(length(List(1, 1, 2, 3, 5, 8)))

  println(length(List("bubu", "dada", "gaga")))

  println(length2(List(1, 1, 2, 3, 5, 8)))

  println(length2(List("bubu", "dada", "gaga")))


}
