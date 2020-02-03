package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John")
  println(person.age)
  person.greet("Daniel")
}
class Person(name: String, val age : Int){ // age is a field
  val x = 2 // field
  println(1+ 3)

  def greet(name: String) : Unit = println(s"${this.name} says : Hi , $name ")

  def greet(): Unit = println(s"Hi, i am $name")

  def this(name : String) = this(name,0)
  def this() = this("John Deo ")
}

// class parameters are NOT FIELDS
