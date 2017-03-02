/*
  Define a linked hash map that maps "Monday" to
  java.util.Calendar.MONDAY, and similarly for the other weekdays.
  Demonstrate that the elements are visited in insertion order.
 */

import java.util.Calendar
import scala.collection.mutable

val daysOfTheWeek = mutable.LinkedHashMap(
  "Monday" -> Calendar.MONDAY,
  "Tuesday" -> Calendar.TUESDAY,
  "Wednesday" -> Calendar.WEDNESDAY,
  "Thursday" -> Calendar.THURSDAY,
  "Friday" -> Calendar.FRIDAY,
  "Saturday" -> Calendar.SATURDAY,
  "Sunday" -> Calendar.SUNDAY
)

for((day,calday) <- daysOfTheWeek) println(s"$day: $calday")