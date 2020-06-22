package com.jjh.streams

object StreamApp extends App {
  // Pre Scala 2.13
  val stream = 3 #:: (2 * 6) #:: 4 #:: Stream.empty
  println(stream) // Head but tail not computed
  stream.foreach(println)
  println(stream) // fully computed

  println("-" * 25)

  val stream2 = stream.map {
    _ * 2
  }
  println(stream2) // Head but tail not computed
  stream2.foreach(println)
  println(stream2) // fully computed

  println("-" * 25)

  val myList = List("One", "Two", "Three")
  val stream3 = myList.toStream
  println(stream3)
  val stream4 = stream3.take(5)
  stream4.foreach(println)

}
