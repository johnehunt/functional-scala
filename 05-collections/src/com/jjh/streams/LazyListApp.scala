package com.jjh.streams

object LazyListApp extends App {

  // Post Scala 2.13
  // Use LazyList (which is fully lazy) instead of Stream (which has a lazy tail only)

  val lazyList = 3 #:: 2#:: 4 #:: LazyList.empty
  println(lazyList) // Not computed
  lazyList.foreach(println _)
  println(lazyList) // Fully evaluated

  println("-" * 25)

  val lazyList2 = lazyList.map{_*2}
  lazyList2.foreach(println _)

  println("-" * 25)

  val myList = List("One", "Two", "Three")
  val lazyList3 = LazyList.empty concat myList
  println(lazyList3)
  val lazyList4 = lazyList3.take(5)
  lazyList4.foreach(println _)
}
