package chapter05_classes.exercises.ex03

/*
  Write a class Time with read-only properties
  hours and minutes and a method
  before(other: Time): Boolean that checks whether this
  time comes before the other. A Time object should be
  constructed as new Time(hrs, min), where hrs is in
  military time format (between 0 and 23).
 */

class Time(private val hours: Int, private val minutes: Int) {
  assert(0 <= hours && hours <= 23,"Hours must be between 0 and 23")
  assert(0 <= minutes && minutes <= 59, "Minutes must be between 0 and 59")

  def getHour = hours
  def getMinute = minutes

  def before(other: Time): Boolean = {
    (60*this.hours + this.minutes) <= (60*other.hours + other.minutes)
  }

  override def toString: String = {
    f"Time($hours%02d:$minutes%02d)"
  }
}

object Time {
  def main(args: Array[String]): Unit = {
    val t1 = new Time(3,57)
    val t2 = new Time(5,23)
    println(t1.before(t2))
    println(t1)
  }
}
