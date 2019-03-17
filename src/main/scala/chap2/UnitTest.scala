package chap2

object UnitTest {

  def main(args: Array[String]): Unit = {

    //null可以复赋值给任意引用类型 AnyRef 不能赋值给值类型
    //var n1 : Int = null
    //print(n1)

    var cat = new Cat()

    cat = null;

  }

}

class Cat {

}
