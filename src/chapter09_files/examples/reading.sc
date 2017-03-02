// We read from files
// with scala.io.Source
import io.Source

val filepath = "/Users/hardmanp/IdeaProjects/" +
  "ScalaForTheImpatient/" +
  "src/chapter09_files/examples/" +
  "prufrock.txt"

// Read all lines with
// getLines.
val nLines = Source
  .fromFile(filepath)
  .getLines()
  .length

// Read by character
Source.fromFile(filepath).length

// Read tokens
Source
  .fromFile(filepath)
  .mkString
  .split("\\s+")
  .length

