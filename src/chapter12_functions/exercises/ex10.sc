/*
  Exercise 10:
  Implement an unless control abstraction that
  works just like if, but with an inverted condition.
  Does the first parameter need to be a call-by-name
  parameter? Do you need currying?
 */
def unless(condition: Boolean)(action: => Unit): Unit ={
  if(!condition) action
}

unless(10 != 20){
  println("Hello world")
}