/*
  Exercise 1:
  Write a function that, given a string, produces a
  map of the indexes of all characters. For example,
  indexes("Mississippi") should return a map associating
  'M' with the set {0}, 'i' with the set {1, 4, 7, 10},
  and so on.
 */
def indexes(s: String): Map[Char, Set[Int]] = {
  def indices_of_char(s: String, c: Char): Seq[Int] = {
    s.zipWithIndex.filter(_._1 == c).map(_._2)
  }
  s.toCharArray
    .distinct
    .map{case (c) => (c, indices_of_char(s,c).toSet)}
    .toMap
}

indexes("Mississippi")

