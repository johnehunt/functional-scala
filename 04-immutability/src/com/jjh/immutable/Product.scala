package com.jjh.immutable

trait Immutable

trait Product extends Immutable {
  val price: Double
}

case class Version(number: Int) extends Immutable {
  override def toString: String = "v" + number

  def next: Version = copy(number + 1)
}

case class Invoice[T <: Product](id: Int,
                                 name: String,
                                 contents: List[T],
                                 version: Version = Version(0)) extends Immutable {
  def total: Double = contents.map(_.price).sum

  def +(p: T): Invoice[T] = Invoice(id, name, p :: contents, version.next)

  def -(p: T): Invoice[T] = Invoice(id, name, contents diff List(p), version.next)
}

case class Book(title: String,
                author: String,
                price: Double) extends Product

object Test extends App {
  val books = List(Book("Java", "John", 12.99))
  var i = Invoice(1, "Denise", books)
  println(i)
  i = i + Book("Scala", "Adam", 10.99)
  println(i)
}