package com.jjh.stackable

object StackableTraitsTest2 extends App {
  val queue = new BasicIntQueue with Incrementing with Doubling
  // val queue = new BasicIntQueue with Doubling with Incrementing
  queue.put(10)
  println(queue.get())
}
