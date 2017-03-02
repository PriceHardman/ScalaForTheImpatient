/*
  Write a function product(s : String) that
  computes the product,
  as described in the preceding exercises.
 */

def product(s: String): Long = {
  var output: Long = 1
  for(c <- s) output *= c.toLong
  output
}
product("Hello")
