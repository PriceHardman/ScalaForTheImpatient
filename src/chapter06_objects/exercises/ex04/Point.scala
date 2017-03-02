package chapter06_objects.exercises.ex04

/*
  Define a Point class with a companion object so
  that you can construct Point instances as
  Point(3, 4), without using new.
 */

class Point(val x: Double, val y: Double) {
  override def toString: String = s"Point($x, $y)"
}

object Point {
  def apply(x: Double, y: Double) = new Point(x,y)

  def main(args: Array[String]): Unit = {
    val origin = Point(0,0) // Point.apply(0,0)
    println(origin)
  }
}
