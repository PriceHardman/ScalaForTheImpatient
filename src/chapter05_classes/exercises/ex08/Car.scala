package chapter05_classes.exercises.ex08

/*
  Make a class Car with read-only properties for manufacturer,
  model name, and model year, and a read-write property for
  the license plate. Supply four constructors. All require
  the manufacturer and model name. Optionally, model year and
  license plate can also be specified in the constructor. If not,
  the model year is set to -1 and the license plate to the empty
  string. Which constructor are you choosing as the primary
  constructor? Why?


  Make Car(make,model) the primary, since those fields
  are mandatory. Then, every other auxiliary constructor
  can call the primary, since those fields have to be
  set regardless.
 */

class Car(val make: String, val model: String) {
  private var yearField: Int = -1
  var licensePlate: String = ""
  def year = yearField

  def this(make: String, model:String, year: Int){
    this(make,model)
    this.yearField = year
  }
  def this(make: String, model: String, licensePlate: String){
    this(make,model)
    this.licensePlate = licensePlate
  }
  def this(make: String, model: String, year: Int, licensePlate: String){
    this(make,model)
    this.yearField = year
    this.licensePlate = licensePlate
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val mustang68 = new Car("Ford","Mustang",1968)
    val timeMachine = new Car("Delorean","DMC12",1985,"OUTATIME")
    println(mustang68.year)
  }
}
