package com.jjh.imp.params

object ImplicitParamTest {

  def main(args: Array[String]): Unit = {
    // Sets up implicit parameter
    implicit val v: Int = 2

    // Uses implicit parameter
    printer("John")
    println()
    println("-" * 20)
    // Explicitly provides second parameter value
    printer("John")(4)
  }

  // Method with 2 parameter lists
  // second parameter list contains keyword implicit
  // must be at start fo parameter list -
  // can have nay number of implicit parameters
  def printer(content: String)(implicit i: Int): Unit = {
    for (_: Int <- 0 until i) print(content)
  }

}
