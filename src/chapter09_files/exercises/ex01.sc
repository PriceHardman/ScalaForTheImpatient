/*
  Exercise 1: Write a Scala code snippet that reverses
  the lines in a file (making the last line the first one,
  and so on).
 */
import io.Source

val filepath = "/Users/hardmanp/IdeaProjects/" +
  "ScalaForTheImpatient/" +
  "src/chapter09_files/examples/" +
  "prufrock.txt"

val lines = Source
  .fromFile(filepath)
  .getLines()
  .toList
  .reverse
  .foreach(println)