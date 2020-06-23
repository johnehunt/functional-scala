package com.jjh.stackable

trait Doubling extends IntQueue {
  abstract override def put(x: Int): Unit = {
    println(s"Doubling $x")
    super.put(2 * x)
  }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int): Unit = {
    println(s"Incrementing $x")
    super.put(x + 1)
  }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit = {
    println(s"Filtering $x")
    if (x >= 0) super.put(x)
  }
}
