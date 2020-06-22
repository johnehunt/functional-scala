package com.jjh.futures

import com.jjh.book.{Book, BookService}

object BookServiceApp3 extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global

  Future {
    BookService.getBook("123")
  }.map { b => b.title } .foreach(println)

  println("Press Enter to continue")
  scala.io.StdIn.readLine()

  Future {
    BookService.getBook("999")
  }.recoverWith { case _: Exception => Future {
    Book("not a book", "Anon", 0.0)
  }
  }.foreach(println)

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

}
