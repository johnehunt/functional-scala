package com.jjh.imp.contextbounds

case class Person(name: String, age: Int)

object ContextBoundsExampleApp extends App {

  def min[A](a: A, b: A)(implicit ord: Ordering[A]) = {
    import ord._
    if (a < b) a else b
  }

  implicit val ordering = Ordering.by((p: Person) => p.age)

  val p1 = Person("John", 55)
  val p2 = Person("Phoebe", 23)

  println(min(p1, p2))

}
