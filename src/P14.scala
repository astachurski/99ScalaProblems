object P14 extends App {

  def dupl[A](list: List[A]): List[A] = {

    list.zip(list).flatMap(x => List(x._1, x._2))

  }

  val src = List(1, 2, 3, 4, 5, 6, 7)

  println(dupl(src))

  val src2 = List("sraka", "ptaka", "nieboraka")

  println(dupl(src2))
}
