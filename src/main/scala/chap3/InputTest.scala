package chap3

import scala.io.StdIn

object InputTest {

  def main(args: Array[String]): Unit = {

    var name = StdIn.readInt()

    println(name)

    Cat.sayOk()



  }

  //object在底层生成两个类 Cat Cat$
  //会生成一个Cat$类型 和一个静态对象 MODULE$
  //然后用MODULE方法
  object Cat {

    def sayOk() : Unit = {
      println("cat say ok")
    }

  }

}
