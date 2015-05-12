/**
 * Created by ByeongSu on 2015-05-12.
 */

import scala.util.control._

object quiz1 {
  def main(args: Array[String]) {
    val a = Range(3, 1000, 3)
    val b = Range(5, 1000, 5)

    var time = System.currentTimeMillis()
    var sum = a.sum + b.sum - dummyFoo(a, b)
    System.out.println("Dummy method : " + sum + ", elapsed : " + (System.currentTimeMillis() - time))

    time = System.currentTimeMillis()
    sum = a.filter(x => x % 5 != 0).sum + b.sum
    System.out.println("Method2 : " + sum + ", elapsed : " + (System.currentTimeMillis() - time))

    time = System.currentTimeMillis()
    sum = a.diff(b).sum + b.sum
    System.out.println("Method3 : " + sum + ", elapsed : " + (System.currentTimeMillis() - time))
  }

  def dummyFoo(a: Range, b: Range) = {
    val loop = new Breaks
    var ret = 0
    for (iter <- a) {
      loop.breakable {
        for (iter2 <- b) {
          if (iter == iter2) {
            ret += iter2
            loop.break()
          }
        }
      }
    }
    ret
  }

}


