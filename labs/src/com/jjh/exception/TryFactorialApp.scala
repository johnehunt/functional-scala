package com.jjh.exception

import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

object TryFactorialApp extends App {

  @tailrec
  def factorial(acc: Int = 1, n: Int): Int =
  // Termination condition
    if (n < 0)
      throw new Exception("Number can't be less than Zero")
    else if (n == 0)
      0
    else if (n == 1)
      acc // Base case
    else
      factorial(acc * n, n - 1) // Tail Recursive call

  Try {
    factorial(n = -1)
  } match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }

  Try {
    factorial(n = -1)
  }.recover {
    case _: Exception => 0
  }.map(println)

}
