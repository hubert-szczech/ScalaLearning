package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, movie : String){
    def likes(movie : String): Boolean = movie.equals(this.movie)
    def +(person : Person) : Unit = println(s"${this.name} meet with ${person.name}")
  }

  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println( mary likes "Inception") // infix notation = operator notation

  val john = new Person("John","Inception")
  john + mary
  john.+(mary)

  // All operators are methods
  1.+(2)
  1 + 2



}
