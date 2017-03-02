/*
  Exercise 4: Write a Scala program that reads a
  text file containing only floating-point numbers.
  Print the sum, average, maximum, and minimum of
  the numbers in the file.
 */
import scala.io.Source
val filepath = "/Users/hardmanp/IdeaProjects/" +
  "ScalaForTheImpatient/src/chapter09_files/" +
  "examples/numbers.txt"
val numbers = Source
  .fromFile(filepath)
  .getLines()
  .map(_.toDouble)
  .toList

val sum = numbers.sum
val average = numbers.sum/numbers.length
val maximum = numbers.max
val minimum = numbers.min
println(s"Sum:\t\t$sum")
println(s"Average:\t$average")
println(s"Maximum:\t$maximum")
println(s"Minimum:\t$minimum")
