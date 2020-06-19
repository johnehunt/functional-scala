package com.jjh.streams

object StreamApp extends App {
  // Pre Scala 2.13
  val stream = 3 #:: 2#:: 4 #:: Stream.empty
  println(stream) // Head but tail not computed
  stream.foreach(println _)
  println(stream) // fully computed

  println("-" * 25)

  val stream2 = stream.map{_*2}
  stream2.foreach(println _)

  println("-" * 25)

  val myList = List("One", "Two", "Three")
  val stream3 = myList.toStream
  println(stream3)
  val stream4 = stream3.take(5)
  stream4.foreach(println _)

}
