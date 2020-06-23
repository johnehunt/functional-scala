package com.jjh.higher

object FuncBuilder {

  def build(x: Int): Int => Int = {
    val func =  (y: Int) => x + y
    func
  }

  type IntFunc = Int => Int

  val builder: Int => IntFunc = (x: Int) => (y: Int) => x + y

}

object FuncBuilderApp extends App {
  val func = FuncBuilder.build(5)
  val result = func(3)
  println(result)
}