package com.jjh.imp.contextbounds

import scala.reflect._

object RuntimeTypeInfoApp2 extends App {

  case class Info[T: ClassTag] (data: T) {
    val tpe = classTag[T]
  }

  println(Info[String]("").tpe == classTag[String]) // true
  println(Info[String]("").tpe == classTag[Int])    // false

}
