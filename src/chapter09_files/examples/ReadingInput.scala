package chapter09_files.examples

import scala.io.StdIn

object ReadingInput {
  def main(args: Array[String]): Unit = {
    print("How old are you? ")
    val age = StdIn.readInt()
    println(s"You said you're $age years old.")
  }
}
