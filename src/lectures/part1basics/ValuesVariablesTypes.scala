package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x : Int = 42;
  println(x);

  // compiler can infer types
  // VALS ARE IMMUTABLe

  val aString: String = "hello"
  val anotherString = "goodbye"
  val aBoolean : Boolean = false
  val aChar : Char = 'a'
  val anInt : Int = x
  val aShort : Short = 4161
  val aLong : Long = 5273984343434l
  val aFloat : Float = 2.0f
  val aDouble : Double = 3.14

  //variables

  var aVariable = 5
  aVariable = 12 //side effects



}
