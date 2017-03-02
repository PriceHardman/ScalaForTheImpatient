/*
  Write a for loop for computing the product of the
  Unicode codes of all letters in a string.
  For example, the product of the characters in "Hello" is 9415087488L.
 */

val s = "Hello"

def stringProduct1(s: String): Long = {
  var output: Long = 1
  for(i <- 0 until s.length) output *= s(i).toInt
  output
}

def stringProduct2(s: String): Long = {
  var output: Long = 1
  for(c <- s) output *= c.toInt
  output
}

stringProduct1(s)
stringProduct2(s)