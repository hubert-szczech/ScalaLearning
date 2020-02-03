package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int) : Int = if(n<= 1) 1 else n * factorial(n-1)

  def anotherFactorial(n: Int ) : Int = {
    @tailrec
    def factHelper(x :Int , accumulator : Int) : Int =   if(x <= 1) accumulator else factHelper(x-1, x * accumulator)
    // tail recursion, use recursion call as the last expression and the space in memory will be reserved like for one call
    factHelper(n,1)
  }


  //WHEN YOU NEED LOOP, USE TAIL RECURSION


  //EXERCISES


  //========================= 1 ==============================\\
  def concatenateString(string : String , n : Int) : String = {
      @tailrec
     def concatHelper(string: String, n : Int ,accumulator : String ) : String = if(n <= 0) accumulator else concatHelper(string,n-1,accumulator + string)
    concatHelper(string,n,"");
  }
  println(concatenateString("[] ", 10));


  //========================= 2 ==============================\\

def isPrime(n : Int) : Boolean = {
  @tailrec
  def isPrimeUntil(n : Int,t : Int, accumulator : Boolean) : Boolean = if(t <= 1 || accumulator == false) accumulator else isPrimeUntil(n, t - 1,n % t != 0)
  if(n <= 0) return false;
  isPrimeUntil(n,n/2,true)
}
  println(isPrime(1117));


  //========================= 3 ==============================\\

  def fibonacciFunction(n  : Int ) : Int = {
    def fibHelper(i: Int, one: Int, two: Int): Int = if (i >= n) one else fibHelper(i + 1, one + two, one)
    if(n <= 2) 1 else fibHelper(2, 1, 1);
  }
  println(fibonacciFunction(8))
}
