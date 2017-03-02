package chapter05_classes.examples.ex01

/*
  In simplest form, Scala classes are pretty straightforward
 */

class Counter {
  private var value = 0 // You must initialize the field.
  def increment() { value += 1}
  def current() = value // Getter method for value
}

object Counter {
  def main(args: Array[String]): Unit = {
    val counter = new Counter()
    println(counter.current()) // Can call the getter method
    println(counter.value) // Can access the private field since we're in the companion object.
  }
}
