package chap2

object TestBool {

  def main(args: Array[String]): Unit = {

    var  isPass : Boolean = false
    var res=sayOk()
    print(res)

    var t = null
    print(t)

    val t2 = test()


  }

  def sayOk() : Unit = { //Unit表示没有返回值

    print("ok")

  }

  def test() : Nothing = {

    //抛出异常
    throw new Exception()

  }



}

