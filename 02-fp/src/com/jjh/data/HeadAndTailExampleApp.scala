package com.jjh.data

object HeadAndTailExampleApp extends App {
  val list = List(1, 2, 3, 4)
  printEach(list)

  def printEach(ls: List[Any]): Unit = ls match {
    case Nil => println("Done")
    case (head: Any) :: tail =>
      println(head)
      printEach(tail)
  }

}
