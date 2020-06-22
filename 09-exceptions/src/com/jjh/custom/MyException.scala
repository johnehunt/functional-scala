package com.jjh.custom

/**
 * Custom Exception type.
 */
class MyException(_msg: String = "", _exp: Throwable = null) extends RuntimeException(_msg, _exp)

object ExceptionGenerationApp extends App {
    throw new MyException()
}
