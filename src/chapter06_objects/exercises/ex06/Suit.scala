package chapter06_objects.exercises.ex06

/*
  Write an enumeration describing the four playing
  card suits so that the toString method
  returns ♣, ♦, ♥, or ♠.
 */

object Suit extends Enumeration{
  val Club    = Value("♣")
  val Diamond = Value("♦")
  val Heart   = Value("♥")
  val Spade   = Value("♠")
}

object Main {
  def main(args: Array[String]): Unit = {
    println(Suit.Club)
    println(Suit.Diamond)
    println(Suit.Heart)
    println(Suit.Spade)
  }
}
