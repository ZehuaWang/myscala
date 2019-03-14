package chap2

object FloatDemo01 {

  def main(args: Array[String]): Unit = {

    var n1 = 5.12E1
    println(n1)

    var n2 = 5.12E-10
    println(n2)

    //高精度小数时 选择double
    var n3 = 2.345678912f
    var n4 = 2.345678912

    println("n3 " + n3)
    println("n4 " + n4)


  }

}
