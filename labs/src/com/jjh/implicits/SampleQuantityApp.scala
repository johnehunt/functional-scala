package com.jjh.implicits

object SampleQuantityApp extends App {
  println("Starting")
  val q1 = Quantity(5)
  val q2 = Quantity(10)
  println(s"q1 = $q1, q2 = $q2")

  val q3 = q1 + q2
  println(s"q3 = $q3")

  println(s"q2 - q1 = ${q2 - q1}")
  println(s"q2 - 3 = ${q2 - 3}")
  // Added via pimp my type pattern
  println(s"15 - q2 = ${15 - q2}")

  println(s"q2 * q1 = ${q2 * q1}")
  println(s"q2 * 2 = ${q2 * 2}")
  println(s"2 * q2 = ${2 * q2}")

  println(s"q2 / q1 = ${q2 / q1}")
  println(s"q2 / 2 = ${q2 /2}")

  println(s"q2 == q1 = ${q2 == q1}")
  println(s"q2 != q1 = ${q2 != q1}")
  println(s"q2 < q1 = ${q2 < q1}")
  println(s"q2 > q1 = ${q2 > q1}")

  println("Done")
}
