package chap1

/**
  * 分析执行流程
  * 利用反编译文件 将字节码反编译为java代码
  * 1. object在底层会生成两个类
  * 2. Hello中有个main函数 调用Hello$类的一个静态对象
  * 3. Hello$.MODULE$. 对象是静态的 通过该对象调用Hello$的main函数
  * 4.在main函数中写的代码 放在Hello$的main 在底层执行的scala编译器做了一个包装
  */
object Hello {

  def main(args: Array[String]): Unit = {
    println("hello,scala")

    //定义变量
    var n1 : Int = 1
    var N1 : Int = 2

    //Scala最好是一行一条语句 最后不要带分号

    println("namea\tge") //制表符
    println("k\"kk")
    println("你好 \nhello")
    println("abc\ru")

  }

}
