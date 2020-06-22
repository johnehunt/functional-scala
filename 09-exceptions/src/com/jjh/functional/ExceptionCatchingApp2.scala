package com.jjh.functional

import java.io.FileNotFoundException

import scala.io.Source

object ExceptionCatchingApp2 extends App {

  import scala.util.control.Exception

  // Set up exception handling
  val fileCatch =
    Exception.catching(
      classOf[FileNotFoundException])
      .withApply {
        e => throw new RuntimeException("problem", e)
      }

  // Read from file
  val content = fileCatch.opt {
    Source.fromFile("test.txt").getLines.mkString("\n")
  }

  // Check for success or failure
  println(content.getOrElse("File Not Found"))

}
