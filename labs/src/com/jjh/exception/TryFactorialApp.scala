package com.jjh.exception

import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

class FactorialException(_msg: String) extends RuntimeException(_msg)

object TryFactorialApp extends App {

  @tailrec
  def factorial(acc: Int = 1, n: Int): Int =
  // Termination condition
    if (n < 0)
      throw new FactorialException("Number can't be less than Zero")
    else if (n == 0)
      1
    else if (n == 1)
      acc // Base case
    else
      factorial(acc * n, n - 1) // Tail Recursive call

  // Successful factorial calculation
  Try {
    factorial(n = 5)
  } match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }

  // Error Calculation
  Try {
    factorial(n = -1)
  } match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }

  // Define what to do if an error occurs and pass to result
  val result: Try[Int] = Try {
    factorial(n = -1)
  }.recover {
    case _: FactorialException => 0
  }
  result.map(println)

}
