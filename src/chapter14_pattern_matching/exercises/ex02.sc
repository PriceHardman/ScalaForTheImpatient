/*
  Exercise 2:
  Using pattern matching, write a function
  swap that receives a pair of integers
  and returns the pair with the components
  swapped.
 */
def swap(pair: (Int, Int)): (Int, Int) = pair match {
  case (x,y) => (y,x)
}

swap((2,1))