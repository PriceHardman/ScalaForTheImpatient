package chapter07_packages.exercises.ex03

/*
  Write a package random with functions
    nextInt(): Int,
    nextDouble(): Double, and
    setSeed(seed: Int): Unit.
  To generate random numbers, use the
  linear congruential generator
    next = (previous × a + b) mod 2n,
  where a = 1664525, b = 1013904223, n = 32,
  and the inital value of previous is seed.
 */

package object random{
  private var previousDouble: Double = 0.0
  private var previousInt: Int = 0
  private val a = 1664525
  private val b = 1013904223
  private val n = 32

  def setSeed(seed: Int): Unit = {
    previousDouble = seed.toDouble
    previousInt = seed
  }
  def nextInt(): Int = {
    previousInt = (previousInt * a + b) % (2*n)
    previousInt
  }
  def nextDouble(): Double = {
    previousDouble = (previousDouble * a+b) % (2*n)
    previousDouble
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    random.setSeed(42)
    for(i <- 1 to 10){
      println(s"${random.nextInt()},\t${random.nextDouble()}")
    }
  }
}
