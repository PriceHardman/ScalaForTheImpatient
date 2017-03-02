/*
  Make the function of the preceding exercise a recursive function.
 */

def product(s: String): Long = {
  def go(product: Long, substr: String): Long = {
    if(substr.length == 1) product * substr(0).toLong
    else go(product * substr(0).toLong,substr.drop(1))
  }
  go(1,s)
}

product("Hello")