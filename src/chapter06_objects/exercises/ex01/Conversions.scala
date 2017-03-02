package chapter06_objects.exercises.ex01

/*
  Write an object Conversions with methods
  inchesToCentimeters, gallonsToLiters, and
  milesToKilometers.
 */

object Conversions {
  def inchesToCentimeters(inches: Double): Double ={
    2.54*inches
  }
  def gallonsToLiters(gallons: Double): Double = {
    3.78*gallons
  }
  def milesToKilometers(miles: Double): Double = {
    1.60*miles
  }
}
