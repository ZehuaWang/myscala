package chap3

object Demo2 {

  def main(args: Array[String]): Unit = {

    var days = 231

    var weeks = days / 7

    var leftDays  = days % 7

    println(weeks)

    println(leftDays)

    println(s"${weeks}个星期")

    var huashi = 233.5
    var sheshi = (5.0/9)*(huashi-100)
    println(sheshi.formatted("%.1f"))

    var a = 2.3 //double
    var b = 2.3f //float

    //2.3 与 2.3f 在内存中精度不同

    println(a == b)

    //求两个数的最大值
    var n1 = 10
    var n2 = 20

    //Scala中 if else可以返回值
    var res = if (n1 > n2) n1 else n2

    println(res)


  }

}
