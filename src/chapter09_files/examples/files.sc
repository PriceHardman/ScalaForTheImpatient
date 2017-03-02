import java.io.PrintWriter

/*
  Scala has no built-in support for writing files.
  To write to a text file, use java.io.PrintWriter:
 */
val filepath = "/Users/hardmanp/IdeaProjects/ScalaForTheImpatient" +
  "/src/chapter09_files/examples/"
val out = new PrintWriter(filepath + "numbers.txt")
for(i <- 1 to 10) out.println(i)
out.close()

/*
  Note that this doesn't append to the file;
  It replaces whatever was already in there.
 */
