package com.jjh.imp.contextbounds

object RuntimeTypeInfoApp extends App {
  case class Info[T](data: T)

  println(Info[String]("").isInstanceOf[Info[String]]) // true
  println(Info[String]("").isInstanceOf[Info[Int]]) // ?? also true

}
