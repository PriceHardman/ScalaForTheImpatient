/*
  Exercise 1:
    Your Java Development Kit distribution
    has the source code for much of the
    JDK in the src.zip file. Unzip and
    search for case labels (regular expression
    case [^:]+:). Then look for comments starting
    with // and containing [Ff]alls? thr to catch
    comments such as // Falls through or
    // just fall thru. Assuming the JDK programmers
    follow the Java code convention, which requires
    such a comment, what percentage of cases
    falls through?
 */

// Assuming the follwowing has already been run:
// unzip -q "$JAVA_HOME/src/zip -d /tmp/jdk_src/
import java.io.File
import io.Source

def allFilesBelow(dir: File): Iterator[File] = {
  val children = dir.listFiles
  children.toIterator ++ children.filter(_.isDirectory).toIterator.flatMap(allFilesBelow)
}

def hasCaseStatement(f: File): Boolean = {
  val contents = Source.fromFile(f).mkString
  "case [^:]+:".r.findFirstIn(contents).isDefined
}




val filesWithCase = allFilesBelow(new File("/tmp/jdk_src/"))
  .filter(_.getPath.matches(".*\\.java$")) // only java source files
  .filter(hasCaseStatement)
  .take(10)
  .foreach(println)




