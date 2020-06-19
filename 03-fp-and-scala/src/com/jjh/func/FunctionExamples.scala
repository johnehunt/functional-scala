package com.jjh.func

object FunctionExamples extends App {

  // var increase: Function1[Int, Int] = (x: Int) => x + 1
  // var increase: Int => Int = (x: Int) => x + 1
  var increase = (x: Int) => x + 1


  println(s"increase: $increase")
  println(s"increase(5): ${increase(5)}")

  var y = 1
  y = increase(y)
  println("Increased y: " + y)

  val increment = increase
  println("increase using increment: " + increment(2))

  increase = (x: Int) => x + 99
  y = increase(y)
  println("2nd Increased y: " + y)


}
