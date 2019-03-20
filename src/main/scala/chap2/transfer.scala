package chap2

object transfer {

  def main(args: Array[String]): Unit = {

    var n = 1 + 2.0
    //print(n)

    var n2 : Long = 1L
    // var n3 : Int = n2 错误 不能把高精度赋值给低精度

    //Byte short 和 char之间不会相互转换
    var n4 : Byte = 1
    //var c1 : Char = n4

    //byte short char 三者可以相互计算 在计算时首先转换为int类型
    var b : Byte = 10
    var c : Char = 90
    //var s : Short = b + c
    //var s2: Short = 10 + 90
    var s3 : Short = 100

    var num : Int = 2.7.toInt

    var r1 : Int = 10*3.5.toInt + 6*1.5.toInt

    print(r1)

    var s:Short = 5
    //s = s - 2

    //var b : Byte = 3


  }

}
