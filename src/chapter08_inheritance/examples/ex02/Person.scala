package chapter08_inheritance.examples.ex02

abstract class Person {
  def id: Int // no method body -- abstract method
  val SSN: String // abstract field with abstract getter
  var name: String

  // abstract field with abstract getter and setter
  override def toString: String = s"Person($name)"
}

class Employee(var name: String, val SSN: String) extends Person {
  def id = name.hashCode // no need for override
}

object Employee {
  def main(args: Array[String]): Unit = {
    // You can always customize an abstract field by using
    // an anonymous type:
    val fred = new Person {
      def id = 10
      val SSN = "123-45-6789"
      var name = "Fred"
      override def toString: String  = s"AnonymousPerson($name)"
    }
    println(fred)
  }
}
