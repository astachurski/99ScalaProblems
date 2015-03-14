import scala.collection.immutable.Queue

val s = "Wlazl kotek na ploteki i sie zwalil na ryj"

val ml = s.split("\\W").toList

val res = ml.foldLeft(100)((acc, c) => acc.min(c.length))


//lambda assigned to variable
val k =  (x: Int, y: Int) => x + y

//test :-)
k(3, 5)

//taking some function(x,y) and int
val d = (f:(Int, Int)=>Int, a:Int) => f(3, 4) + a

//passing function and int
d(k,8)

//d(k)(8) //does not work

//now "currying":
val zyz = d.curried

//now this way works
zyz(k)(8)

//reducing to 1 parameter call:
val myc = zyz(k)

//works...
myc(8)


def du(a:Int)(b:String):String = {a.toString + b}

du(3)("bubu")

du(_:Int)("gaga")

du(4)(_)

234 % 10

10 % 12

val bu = Some("bukaka")


val q = Queue(1,2,3,4,5)

q.enqueue(20)

q.enqueue(21)

q.dequeue







