//P01 (*) Find the last element of a list.
//Example:
/*
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
*/
object P01 extends App {


  def mylast[A](list: List[A]): A = list match {

    case head :: Nil => head
    case head :: tail => mylast(tail)
    case _ => throw new Exception("error!")


  }

  val a1 = List(1, 1, 2, 3, 5, 8)
  println(mylast(a1))

  val a2 = List("Sraka","ptaka", "nieboraka")
  println(mylast(a2))

  mylast(Nil)


}
