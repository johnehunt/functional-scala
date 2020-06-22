package com.jjh.implicits

case class Quantity(value: Int) {
  // Numerical Operators
  def +(q: Quantity): Quantity = Quantity(value + q.value)

  def +(q: Int): Quantity = Quantity(value + q)

  def -(q: Quantity): Quantity = Quantity(value - q.value)

  def -(q: Int): Quantity = Quantity(value - q)

  def *(q: Quantity): Quantity = Quantity(value * q.value)

  def *(q: Int): Quantity = Quantity(value * q)

  def /(q: Quantity): Quantity = Quantity(value / q.value)

  def /(q: Int): Quantity = Quantity(value / q)

  def %(q: Quantity): Quantity = Quantity(value % q.value)

  def %(q: Int): Quantity = Quantity(value % q)

  // Logical operators
  def <(q: Quantity): Boolean = value < q.value

  def <(q: Int): Boolean = value < q

  def >(q: Quantity): Boolean = value > q.value

  def >(q: Int): Boolean = value < q

  def ==(q: Quantity): Boolean = value == q.value

  def ==(q: Int): Boolean = value == q

  def !=(q: Quantity): Boolean = value != q.value

  def !=(q: Int): Boolean = value != q

  def <=(q: Quantity): Boolean = value <= q.value

  def <=(q: Int): Boolean = value <= q

  def >=(q: Quantity): Boolean = value >= q.value

  def >=(q: Int): Boolean = value >= q
}

object Quantity {
  // Handle working with int as first type
  implicit def int2Quantity(x: Int): Quantity = new Quantity(x)
}
