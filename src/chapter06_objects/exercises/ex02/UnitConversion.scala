package chapter06_objects.exercises.ex02

/*
  The preceding problem wasn’t very object-oriented.
  Provide a general super-class UnitConversion and
  define objects InchesToCentimeters, GallonsToLiters,
  and MilesToKilometers that extend it.
 */

class UnitConversion(val conversionFactor: Double) {
  def convert(x: Double) = conversionFactor*x
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78)
object MilesToKilometers extends UnitConversion(1.60)

object Main {
  def main(args: Array[String]): Unit = {
    println(InchesToCentimeters.convert(10))
    println(GallonsToLiters.convert(1.0))
    println(MilesToKilometers.convert(6.2))
  }
}


