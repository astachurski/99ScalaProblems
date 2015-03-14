package other

/**
 * Created by adrian on 2/23/2015.
 */
object test2 extends App {

  class Point(val xc: Int, val yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println("Point x location : " + x)
      println("Point y location : " + y)
    }
  }

  class Location(override val xc: Int, override val yc: Int,
                 val zc: Int) extends Point(xc, yc) {
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println("Point x location : " + x)
      println("Point y location : " + y)
      println("Point z location : " + z)
    }
  }


  class Dupa(val x: Int) {

    def mym() = print("bubu")

  }

  class Asshole(override val x:Int) extends Dupa(x) {

    override def mym() = {print("pipipi")}

  }

  val a: Dupa = new Asshole(3)
  a.mym()


}
