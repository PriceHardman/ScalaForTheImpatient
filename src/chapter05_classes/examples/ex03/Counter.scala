package chapter05_classes.examples.ex03

/*
  Sometimes you want a read-only property with a getter but no setter.
 */

class Counter {
  // If the value of the property never changes after the object is
  // constructed, use a val field
  val timestamp = new java.util.Date // gets implemented as private final field with no setter.

  /*
    Sometimes however you want a property that a client can't set at will, but that is
    mutated in some other way. A val won't work. Instead, provide a private field and
    a property getter.
   */
  private var value = 0
  def current = value // Omitting parentheses ensures we MUST call without parentheses
}

object Counter {
  def main(args: Array[String]): Unit = {
    val counter = new Counter()
    counter.value // counter.value() is syntax error.
  }
}


/*
  In short, there are four choices for implementing properties:
    1. var foo: Scala synthesizes a getter and setter.
    2. val foo: Scala synthesizes a getter.
    3. You define your own foo and foo_= methods.
    4. You define a method foo.
 */
