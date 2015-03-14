import scala.collection.mutable

val a: Option[String] = Some("bbubvgaga")
val b: Option[String] = None


a.foldLeft(-1)((acc, x) => x.length)

(-1 /: a)(_ + _.length + 1)



println("---------------")

a match {
  case Some(a) => a.length;
  case None => -1
}

println("---------------")



println("---------------")

a.map(x => x length).getOrElse(-1)



//b.flatMap(x => if (!x.isEmpty) Some(x.length) else Some(-1))


val s = "sraka ptaka nieboraka dupaka"

s.split("\\W").toList collect {
  case "ptaka" => "kurczaka"
  case x => x
}


val kk = new Array[Int](30)

val ss = List(1, 2, 3, 4)

for (x <- ss.iterator) {
  println(x)
}


val ke = Array(ss: _*)

ke(2) = 44

val ts = mutable.TreeSet("kupa", "ptaka")

val ts2 = mutable.TreeSet.empty[Int]

ts2 +=(9)
ts2 +=(10)
ts2 ++ (mutable.TreeSet(88))



val k = List("rstrst", 988)

val ers = Array("sneitsrneisrt", 8)







