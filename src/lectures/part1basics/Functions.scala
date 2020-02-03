package lectures.part1basics

object Functions extends App {

  def aFunction(a : String, b :Int): String = a + " " + b
  println(aFunction("Hello", 3))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunctions(aString: String, n : Int)  : String = {
    if(n == 1) aString else aString + aRepeatedFunctions(aString,n-1)
  }

  println(aRepeatedFunctions("Hello ", 4))



  //WHEN YOU NEED LOOPS, USE RECURSIONS

  def aFuncWithSideEffects(aString : String) : Unit = println("")

  def aBigFunction(n : Int) : Int = {
    def aSmallerFunction( a : Int, b : Int ) : Int = a + b
    aSmallerFunction(n,n-1)
  }

    def aGreetingFunction(name: String, age : Short) : String = {
      "Hi I am " + name + " and I am " + age + "years old."
    }
    println(aGreetingFunction("Hubert", 20))

    def factorialFunction(n  : Int ) : Long = {
      if(n <= 1 ) n else n * factorialFunction(n-1)
    }
  println(factorialFunction(3))

  def fibonacciFunction(n  : Int ) : Long = {
    if(n <= 2)  1 else fibonacciFunction(n -1) + fibonacciFunction(n - 2 )
  }
  println(fibonacciFunction(36))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t : Int) : Boolean = {
      if(t <= 1) true else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

}
