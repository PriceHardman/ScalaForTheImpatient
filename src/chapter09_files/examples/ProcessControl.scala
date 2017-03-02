package chapter09_files.examples
import scala.sys.process._

object ProcessControl {
  def main(args: Array[String]): Unit = {
    /*
  The scala.sys.process package allows for
  Scala programs to interact with the shell.

  Here's a simple example:
 */
    "pwd" ! // prints `pwd` to stdout

    /*
      The sys.process package contains an implicit
      conversion from strings to ProcessBuilder objects.
      The ! operator executes the ProcessBuilder object.

      The result of the ! operator is the exit code of
      the executed program: 0 if successful and nonzero
      for failure of some kind.

      If you use !! instead of !, the result is returned
      as a string
     */
    val pwd = "pwd" !!

    // We can also pipe output using #|
    "ps aux" #| "head" !
  }
}
