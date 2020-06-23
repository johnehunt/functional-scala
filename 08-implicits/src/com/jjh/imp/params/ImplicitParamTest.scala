package com.jjh.imp.params

import Utils._
import Helpers.doit

object ImplicitParamTest {

  def main(args: Array[String]): Unit = {

    // Uses implicit parameter
    printer("John")
    println()
    println("-" * 20)
    // Explicitly provides second parameter value
    printer("John")(6, "r")
  }

  // Method with 2 parameter lists
  // second parameter list contains keyword implicit
  // must be at start fo parameter list -
  // can have nay number of implicit parameters
  def printer(content: String)(implicit i: Int, s: String): Unit = {
    for (_: Int <- 0 until i) print(content + s)
  }

}
