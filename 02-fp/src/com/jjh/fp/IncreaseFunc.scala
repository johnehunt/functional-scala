package com.jjh.fp

object IncreaseFunc extends App {

  // val increase = (x: Int) => x + 1
  var increase: Function1[Int, Int] = (x: Int) => x + 1


  println(s"increase: $increase")
  println(s"increase(5): ${increase(5)}")

  // Can assign address of function
  val increment = increase
  println("increase using increment: " + increment(2))

  // If increase is a var
  increase = (x: Int) => x + 99
  val y = increase(4)
  println("2nd Increased y: " + y)


}
