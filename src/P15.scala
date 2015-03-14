object P15 extends App {

  def duplicateN[A](n: Int, list: List[A]): List[A] = {

    list flatMap (x => List.fill(n)(x))

  }

  val a = List('a, 'b, 'c, 'c, 'd)

  println(duplicateN(3, a))


}
