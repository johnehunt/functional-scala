package com.jjh.data

import scala.annotation.tailrec

object HeadAndTailExampleApp extends App {
  val list = List(1, 2, 3, 4)
  printEach(list)

  @tailrec
  def printEach(ls: List[Any]): Unit = ls match {
    case Nil => println("Done")
    case (head: Any) :: tail =>
      println(head)
      printEach(tail)
  }

}
