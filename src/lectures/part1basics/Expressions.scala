package lectures.part1basics

object Expressions extends App {
  val aInt : Int = if(true) 5  else  1
  println(aInt)

  var i = 0
  //Everything is expression
  val aWeirdValue = while (i < 10) {
    i += 1
  }
    println(aWeirdValue)
  // Unit === void === ()
  // side effect: println(),whiles, reassigning

  // CODE BLOCK

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if(z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

  // l. difference between "hello world" vd println("hello world")  ||  string vs unit and side effect cuz print text in console
  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)




}
