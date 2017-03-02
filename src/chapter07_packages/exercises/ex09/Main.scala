package chapter07_packages.exercises.ex09

/*
  Write a program that imports the java.lang.System class,
  reads the user name from the user.name system property,
  reads a password from the Console object, and prints a
  message to the standard error stream if the password is
  not "secret". Otherwise, print a greeting to the
  standard output stream. Do not use any other imports,
  and do not use any qualified names (with dots).
 */

import java.lang.System.getProperty
import java.lang.System.err.{println => printToStdErr}
import java.lang.System.out.{println => printToStdOut}
import Console.readLine

object Main {
  def main(args: Array[String]): Unit = {
    val user = getProperty("user.name")
    val password = readLine(s"Hello, $user. Enter your password: ")
    if(password != "secret"){
      printToStdErr("Password is incorrect.")
    } else {
      printToStdOut(s"Greetings, $user.")
    }
  }
}
