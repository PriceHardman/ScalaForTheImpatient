package chapter05_classes.exercises.ex07

/*
  Write a class Person with a primary constructor
  that accepts a string containing a first name,
  a space, and a last name, such as new Person("Fred Smith").
  Supply read-only properties firstName and lastName.
  Should the primary constructor parameter be a var,
  a val, or a plain parameter? Why?
 */

// Make fullName a val, since we don't intend on
// having it be mutable.
class Person(val fullName: String) {
  val firstName = fullName.split(" ")(0)
  val lastName = fullName.split(" ")(1)
}

object Person {
  def main(args: Array[String]): Unit = {
    val person = new Person("Price Hardman")
    println(person.firstName)
    println(person.lastName)
  }
}
