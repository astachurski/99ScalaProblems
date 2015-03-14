val a = Array(5, 2, 7, 5, 9, 2, 5, 1, 8, 5, 9, 0, 3, 5, 7, 2)

//a.sortBy(x => x)

a.head
a.tail

//a match {case head => Nil}

a.filter(5 < _)


def sortme(a: Array[Int]): Array[Int] = {

  var pivot = 0
  if (a.length > 0) {
    pivot = a(a.length / 2)
    Array.concat(
      sortme(a.filter(pivot >)),
      a.filter(pivot ==),
      sortme(a.filter(pivot <)))
  }
  else a

}
val myres = sortme(a)




def srt(list: Array[Int]): Array[Int] = {
  val piv = 0
  val leftIdx = 0
  val rightIdx = list.length
  def srtInt(pivot: Int, left: Int, right: Int, ll: Array[Int]): Array[Int] = {
    if (ll(left) > ll(pivot)) {
      val temp: Int = ll(pivot)
      ll(pivot) = ll(left)
      ll(left) = temp
      srtInt(pivot, left - 1, right - 1, ll)
    }
    else {
      srtInt(pivot, left, right - 1, ll)
    }
    //srtInt()
    //Array(4, 5, 6)
    list
  }
  srtInt(piv, leftIdx, rightIdx, list)
}
//srt(a)

val ze = Map(1 -> "sere", 2 -> "sese")

val ano = ze + (3 -> "bubu")

val ru = ano + (1 -> "bibi")

