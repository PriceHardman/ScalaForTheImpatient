/*
  Exercise 3: Write a Scala code snippet that
  reads a file and prints all words with more
  than 12 characters to the console. Extra
  credit if you can do this in a single line.
 */
import io.Source

val filepath = "/Users/hardmanp/IdeaProjects/" +
  "ScalaForTheImpatient/" +
  "src/chapter09_files/examples/" +
  "prufrock.txt"

Source
  .fromFile(filepath)
  .getLines()
  .filter("\\w{12,}".r.findFirstIn(_).isDefined)
  .foreach(println)
