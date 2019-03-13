package chap2

object VarValDemo02 {

  def main(args: Array[String]): Unit = {
    var dog1 = new Dog()
    val dog2 = new Dog()
    dog1.name = "mary"
    dog1 = null
    dog2.name = "smith"
    //dog2 = null
  }

}

class Dog {
  var name : String = "Tom"

}