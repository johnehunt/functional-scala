package com.jjh.immutable

object SampleQuantityApp extends App {
  println("Starting")
  val q1 = Quantity(5)
  val q2 = Quantity(10)
  println(s"q1 = $q1, q2 = $q2")

  val q3 = q1 + q2
  println(s"q3 = $q3")

  println(s"q2 - q1 = ${q2 - q1}")
  println(s"q2 * q1 = ${q2 * q1}")
  println(s"q2 / q1 = ${q2 / q1}")

  println(s"q2 == q1 = ${q2 == q1}")
  println(s"q2 != q1 = ${q2 != q1}")
  println(s"q2 < q1 = ${q2 < q1}")
  println(s"q2 > q1 = ${q2 > q1}")

  println("Done")
}
