/*
  Exercise 9: Write a function that computes the sum of the non-None values in a
  List[Option[Int]]. Don’t use a match statement.
 */
def sum(l: List[Option[Int]]): Int = {
  l
    .filter(_.isDefined) // remove None's
    .map(_.get) // Get values enclosed in Some's
    .sum // sum them
}

sum(List(Option(1),None,Option(2),None,Option(3))) // => 6
