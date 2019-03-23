package chap3

object fortest {

  def main(args: Array[String]): Unit = {

    var start = 1

    var end = 3

    for(i <- start to end) {
      println(i)
    }

    for(i <- start to end if i!= 2) {
      println(i)
    }


  }


}
