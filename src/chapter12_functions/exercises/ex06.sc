/*
  Exercise 6:
  Modify the previous function to return the input
  at which the output is largest. For example,
  largestAt(x => 10 * x - x * x, 1 to 10) should return 5.
  Don’t use a loop or recursion.
 */

def largestAt(f: (Int) => Int, inputs: Seq[Int]) = {
  inputs.map(x => (x, f(x))).maxBy(_._2)._1

}

largestAt(x => 10 * x - x * x, 1 to 10)