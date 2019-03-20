package chap3

object Demo01 {

  def main(args: Array[String]): Unit = {

    var r1 : Int = 10 / 3
    println("r1 = " + r1)

    var r2 : Double = 10.5 / 3
    println("r2 = " + r2)
    println("r2 = " + r2.formatted("%.2f")) //保留小数点两位 四舍五入

    var r3 = 10 % 3
    println("r3 = " + r3)

    var r4 = (-10 % -3)
    println("r4 = " + r4)

    var n1 = 10
    n1 += 1 //自增
    n1 -= 1 //自减




  }

}
