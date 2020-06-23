package com.jjh.stackable

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  def get(): Int = buf.remove(0)
  def put(x: Int): Unit = {
    println(s"BasicIntQueue $x")
    buf += x
  }
}
