package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, i am learning Scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" " ).toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", " - " ))
  println(str.toLowerCase())

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println("asdfsa".take(2))


  //S - interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, I am $name , and I am $age years old"
  val agreeting = s"Hello, I am $name , and I am ${age + 1} years old"
  println(greeting)
  // F interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)


  // raw interpolator
  val newLine = "This is a \n newline"
  println(raw"$newLine")
}
