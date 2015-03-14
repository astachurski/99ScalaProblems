package other.trees

object MyTreeApp extends App {

  override def main(args: Array[String]) = {

    println("dupa")

    val mtData = MyTree.getSampleData

    mtData.visitNodes((n: MyTree[Int]) => println(n.textData))
  }
}



object MyTree {

  def getSampleData: MyTree[Int] = {

    //3rd level
    val cs666 = List(MyTree(17, Nil), MyTree(18, Nil), MyTree(19, Nil))
    val cs555 = List(MyTree(14, Nil), MyTree(15, Nil), MyTree(16, Nil))
    //2nd level
    val cs22 = List(MyTree(5, cs555), MyTree(6, cs666), MyTree(7, Nil))
    val cs33 = List(MyTree(8, Nil), MyTree(9, Nil), MyTree(10, Nil))
    val cs44 = List(MyTree(11, Nil), MyTree(12, Nil), MyTree(13, Nil))
    //1st level
    val csfrst = List(MyTree(2, cs22), MyTree(3, cs33), MyTree(4, cs44))
    //root
    val root = MyTree(1, csfrst)
    root
  }
}


case class MyTree[T](data: T, childs: Seq[MyTree[T]]) {

  def textData = {
    val childsIds = for (c <- childs) yield c.data + ", "
    s"reporting node: $data with children $childsIds}"
  }

  def visitNodes(visitorFunction: MyTree[T] => Unit): Unit = {


    def recurseNodes(node: MyTree[T]): Unit = {
      visitorFunction(node)
      for (n <- node.childs) recurseNodes(n)
    }
    recurseNodes(this)
  }
}