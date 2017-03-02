/*
  Write a function that computes x^{n}, where n
  is an integer. Use the following recursive definition:
    x^n = y*y if n is even, where y = x^{n/2}
    x^n = x*x^{n-1} if n is odd and positive.
    x^0 = 1
    x^n = 1/x^{-n} if n is negative.
 */

def f(x: Int, n: Int): Double = {
  if (n == 0) 1
  else if (n < 0) 1/f(x,-n)
  else if (n % 2 == 0) f(x,n/2) * f(x,n/2)
  else x * f(x, n-1)
}

f(2,-8)