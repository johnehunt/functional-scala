package com.jjh.future

import scala.annotation.tailrec
import scala.util.{Failure, Success}

object FactorialFutureApp extends App {

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

  import scala.concurrent._
  import scala.concurrent.ExecutionContext.Implicits.global

  // Single Future
  Future {
    Thread.sleep(1000);
    factorial(n = 5)
  }.map(println)

  // Single Future with failure handling
  Future {
    Thread.sleep(1000);
    factorial(n = -15)
  } onComplete {
    case Success(value) => println(s"Success : $value")
    case Failure(e) => println(s"An error occurred $e")
  }

  // Multiple Futures - some failure handling
  val f1 = Future {
    Thread.sleep(1000)
    factorial(n = 5)
  }
  val f2 = Future {
    Thread.sleep(2000)
    factorial(n = 10)
  }
  val f3 = Future {
    Thread.sleep(2000)
    factorial(n = -1)
  }.recoverWith { case e: Exception => Future {0}
  }
  val all = Future.sequence(Seq(f1, f2, f3))
  // Now get a List(10, 20) as a result
  // foreach will wait for all results to be returned
  // before executing
  all.foreach(x => println(s"All done: $x"))

  //  all onComplete {
  //    case Success(value) => println(s"Success : $value")
  //    case Failure(e) => println(s"An error occurred $e")
  //  }

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

}
