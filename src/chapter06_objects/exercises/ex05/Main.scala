package chapter06_objects.exercises.ex05

/*
  Write a Scala application, using the App trait, that
  prints the command-line arguments in reverse order,
  separated by spaces.
  For example, scala Reverse Hello World should
  print World Hello.
 */

object Main extends App {
  if(args.length > 0){
    args.reverse.foreach(arg => print(s"$arg "))
  }
}
