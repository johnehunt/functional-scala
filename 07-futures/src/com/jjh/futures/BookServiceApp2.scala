package com.jjh.futures

import com.jjh.book._

import scala.util.{Failure, Success}

object BookServiceApp2 extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global

  // Set up the future with a recovery strategy if an exception is thrown
  val future = Future {
    BookService.getBook("123")
    // BookService.getBook("999")
  } recoverWith {
    case _: Exception => Future {Book("not a book", "Anon", 0.0)}
  } foreach(println)

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

  // Allow us to specify the max wait time in seconds
  import scala.concurrent.duration._

//  val book = Await.result(future, 2.seconds)
//
//  // print the result of awaiting
//  println(s"Book: $book")

}
