package chapter05_classes.examples.ex04

/*
  Scala allows an even more severe access restriction, called
  object-private, in which no getters and setters are generated
  at all, and so the field is truly only accessible to a single
  object, and not any other instances of the class
 */

class MyClass {
  private[this] val hidden = "Hidden"
  private val lessHidden = "lessHidden"
  def share(other: MyClass): Unit ={
    // other.hidden // Cannot access other.hidden
    other.lessHidden
  }
}
