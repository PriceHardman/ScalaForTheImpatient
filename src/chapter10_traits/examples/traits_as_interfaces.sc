/*
  A Scala trait can work exactly like a Java interface:
 */
trait Logger {
  def log(msg: String) // An abstract method
}

class ConsoleLogger extends Logger { // use extends, not implements
  def log(msg: String) {println(msg)} // no override needed
}

val consoleLogger = new ConsoleLogger()
consoleLogger.log("Hello world")