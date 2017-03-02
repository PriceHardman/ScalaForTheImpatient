package chapter08_inheritance.examples.ex01

class Person(val name: String) {
  override def toString(): String = {s"Person($name)"}
}


class Employee(name: String, salary: Double) extends Person(name) {
  override def toString(): String = {s"Employee($name, $salary)"}
}

object Employee {
  def main(args: Array[String]): Unit = {
    val price = new Person("Price")
    val employeePrice = new Employee("Price",10.00)
    println(price)
    println(price.isInstanceOf[Person])
    println(price.isInstanceOf[Employee])
    println(employeePrice)
    println(employeePrice.isInstanceOf[Person])
    println(employeePrice.isInstanceOf[Employee])
  }
}
