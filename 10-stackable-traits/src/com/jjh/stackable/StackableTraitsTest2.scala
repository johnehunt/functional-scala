package com.jjh.stackable

object StackableTraitsTest2 extends App {
  //val queue = new BasicIntQueue with Incrementing with Doubling
  val queue = new BasicIntQueue with Doubling with Incrementing with Filtering
  queue.put(10)
  queue.put(-1)
  println(queue.get())
}
