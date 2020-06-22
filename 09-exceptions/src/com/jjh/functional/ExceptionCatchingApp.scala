package com.jjh.functional

import java.io.FileNotFoundException

import scala.io.Source

/**
 * Older functional style
 */
object ExceptionCatchingApp extends App {

  import scala.util.control.Exception

  // Set up exception handling
  val fileCatch =
    Exception.catching(
      classOf[FileNotFoundException],
      classOf[RuntimeException])
      .withApply {
        e =>
          e.printStackTrace()
          "File Problem"
      }

  // Read from file
  val content = fileCatch {
    Source.fromFile("test.txt").getLines.mkString("\n")
  }

  println(content)

}
