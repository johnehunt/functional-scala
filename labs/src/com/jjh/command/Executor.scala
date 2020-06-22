package com.jjh.command

import scala.collection.mutable.ListBuffer

case class Executor(history: ListBuffer[Command] = ListBuffer[Command]()) {

  def rerun(): Unit = history.foreach(_ ())

  def execute(cmd: Command): Unit = {
    history.append(cmd); cmd()
  }

  override def toString: String = "Executor: " + history
}


object ExecutorSimpleApp extends App {
  println("Starting")
  val exec = Executor()
  val sayHello = () => println("Hello")
  exec.execute(sayHello)
  val x = 10
  exec.execute(() => println(x * 3))
  println("-" * 30)
  println("Rerun commands in Executor ")
  exec.rerun()
}

