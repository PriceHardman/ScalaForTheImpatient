package chapter06_objects.exercises.ex07

/*
  Implement a function that checks whether a
  card suit value from the preceding exercise is red.
 */

object Suit extends Enumeration{
  val Club    = Value("♣")
  val Diamond = Value("♦")
  val Heart   = Value("♥")
  val Spade   = Value("♠")

  def isRed(suit: Suit.Value): Boolean = {
    suit.equals(Diamond) || suit.equals(Heart)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println(Suit.isRed(Suit.Heart))
    println(Suit.isRed(Suit.Spade))
  }
}
