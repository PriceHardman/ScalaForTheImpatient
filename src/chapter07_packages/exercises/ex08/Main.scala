package chapter07_packages.exercises.ex08

/*
  What is the effect of
    import java._
    import javax._
  Is this a good idea?


  => This imports all the members of packages java and javax into
  the current scope. I highly doubt this is a good idea. At best,
  it makes for a housekeeping mess, and at worst results in
  ambiguous references. For example, java and javax both have
  .lang subpackages.
 */

object Main {
  def main(args: Array[String]): Unit = {
  }
}
