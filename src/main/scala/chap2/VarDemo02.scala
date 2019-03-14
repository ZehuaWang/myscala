package chap2

object VarDemo02 {

  def main(args: Array[String]): Unit = {
    var age = 10
    age = 20

    //age = "Tom" 类型不可改变
    val num = 10
    //num = 20 val不可变

    var min = Byte.MinValue

    println(min)
  }

}
