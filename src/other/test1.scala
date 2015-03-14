package other



/**
 * Created by adrian on 2/21/2015.
 */
object test1 extends App{


  class ImpulseGenerator(duration:Int){

    println("creation time!")

    def generate():Unit = {

      println("bubum")
    }

  }


  val k = new ImpulseGenerator(200)

  k.generate()






}
