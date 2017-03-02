package chapter05_classes.exercises.ex01

/*
  Improve the Counter class in Section 5.1,
  “Simple Classes and Parameterless Methods,”
  on page 49 so that it doesn’t turn negative
  at Int.MaxValue.
 */

class Counter {
  private var value: Long = 0L // You MUST initialize the field
  def increment() {value += 1L}
  def current() = value
}

object Counter {
  def main(args: Array[String]): Unit ={
    val counter = new Counter
    for(i <- 0 until Int.MaxValue) counter.increment()
    println(counter.value)
    counter.increment() // If value weren't long, this would recycle.
    println(counter.value)
  }
}
