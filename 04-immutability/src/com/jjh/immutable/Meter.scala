package com.jjh.immutable

case class Meter(value: Double) {

  def +(m: Meter) : Meter = Meter(value + m.value)
  def -(m: Meter) : Meter = Meter(value - m.value)

}

object MeterSampleApp extends App {
  println("Creating Value instances")
  val x = Meter(3.4)
  val y = Meter(4.3)
  println("Adding Value instances together")
  val z = x + y
  println("Result: " + z)

}