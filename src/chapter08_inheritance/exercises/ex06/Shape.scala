package chapter08_inheritance.exercises.ex06

/*
  Define an abstract class Shape with an abstract method
  centerPoint and subclasses Rectangle and Circle. Provide
  appropriate constructors for the subclasses and override
  the centerPoint method in each subclass.
 */

import chapter08_inheritance.exercises.ex05._

abstract class Shape {
  def centerPoint: Point
}

class Rectangle(val topLeft: Point, length: Double, width: Double) extends Shape {
  override def centerPoint: Point = new Point(topLeft.x + length/2,topLeft.y + width/2)
  def area = length * width
}

class Circle(val centerPoint: Point, radius: Double) extends Shape {
  def area = scala.math.Pi * radius * radius
}
