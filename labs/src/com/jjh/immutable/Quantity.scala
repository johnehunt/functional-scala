package com.jjh.immutable

case class Quantity(value: Int) extends AnyVal {
  // Numerical Operators
  def +(q: Quantity) : Quantity = Quantity(value + q.value)
  def -(q: Quantity) : Quantity = Quantity(value - q.value)
  def *(q: Quantity) : Quantity = Quantity(value * q.value)
  def /(q: Quantity) : Quantity = Quantity(value / q.value)
  def %(q: Quantity) : Quantity = Quantity(value % q.value)

  // Logical operators
  def <(q: Quantity) : Boolean = value < q.value
  def >(q: Quantity) : Boolean = value > q.value
  def ==(q: Quantity) : Boolean = value == q.value
  def !=(q: Quantity) : Boolean = value != q.value
  def <=(q: Quantity) : Boolean = value <= q.value
  def >=(q: Quantity) : Boolean = value >= q.value
}
