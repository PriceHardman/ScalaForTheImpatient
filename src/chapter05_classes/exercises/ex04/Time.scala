package chapter05_classes.exercises.ex04

/*
  Reimplement the Time class from the preceding
  exercise so that the internal representation is
  the number of minutes since midnight
  (between 0 and 24 × 60 – 1). Do not change the public
  interface. That is, client code should be unaffected
  by your change.
 */

class Time(hours: Int, minutes: Int) {
  assert(0 <= hours && hours <= 23,"Hours must be between 0 and 23")
  assert(0 <= minutes && minutes <= 59, "Minutes must be between 0 and 59")

  private val timeInMinutes = 60*hours + minutes

  def getHours = timeInMinutes / 60
  def getMinutes = timeInMinutes % 60

  def before(other: Time): Boolean = {
    this.timeInMinutes <= other.timeInMinutes
  }

  override def toString: String = {
    f"Time($getHours%02d:$getMinutes%02d)"
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
