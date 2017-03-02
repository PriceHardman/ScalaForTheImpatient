/*
  The signum of a number is 1 if the number is positive,
  –1 if it is negative, and 0 if it is zero.
  Write a function that computes this value.
 */

def signum(x: Double): Int = {
  if(x < 0) -1
  else if (x == 0) 0
  else 1
}

signum(-5)
signum(0.0)
signum(0)
signum(3.14159)