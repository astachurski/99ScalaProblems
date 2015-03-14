/*
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/

object P16 extends App {

  def dropN[A](everyN: Int, list: List[A]): List[A] = {

    list.foldRight(1, List[A]())((x, acc) => {
      //if (acc._1 == everyN)
      if (acc._1 % everyN == 0)
        (1, acc._2)
      else
        (acc._1 + 1, x :: acc._2)

    })._2

  }

  val a = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  //exp:  List('a, 'b,     'd, 'e,     'g, 'h,     'j, 'k)

  println(dropN(3, a))
  println(dropN(2, a))

}
