package chapter06_objects.exercises.ex03

/*
  Define an Origin object that extends
  java.awt.Point. Why is this not actually a good idea?
  (Have a close look at the methods of the Point class.)

  For one, Point has methods that allow us to reset
  the location. For Origin to make sense, its location can't
  change, but for Origin to be a subtype of Point, it ought
  to follow Point's API, otherwise it would violate the
  Liskov substitution principle.

  I suppose we could override those methods so they don't work,
  but that seems a bit ham-fisted. Better to just not make
  Origin at all.
 */

object Origin extends java.awt.Point(){
  override def toString: String = s"Point($x, $y)"
}

object Main{
  def main(args: Array[String]): Unit = {
    println(Origin)
  }
}
