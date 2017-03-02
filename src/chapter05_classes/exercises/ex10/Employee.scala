package chapter05_classes.exercises.ex10

/*
  Consider the class
    class Employee(val name: String, var salary: Double) {
      def this() {
        this("John Q. Public", 0.0)
      }
    }
  Rewrite it to use explicit fields and a
  default primary constructor.
  Which form do you prefer? Why?
 */


// This seems much nicer than nesting constructor calls.
class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) {}

object Employee {
  def main(args: Array[String]): Unit = {
    val price = new Employee("Price Hardman",1000000000.00)
  }
}
