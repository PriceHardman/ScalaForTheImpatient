import java.io.File

/*
  There are currently no official Scala classes
  for visiting all files in a directory, nor
  for recursively traversing directories.

  However, its relatively simple to write a
  function that produces an iterator through
  all subdirectories of a directory.
 */
def subDirs(dir: File): Iterator[File] = {
  val children = dir.listFiles.filter(_.isDirectory)
  children.toIterator ++ children.toIterator.flatMap(subDirs)
}

// Lets try it out:
val filepath = "/Users/hardmanp/IdeaProjects/ScalaForTheImpatient" +
  "/src"
subDirs(new File(filepath)).foreach(println)