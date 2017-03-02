/*
  Exercise 3: Implement the factorial function
  using to and reduceLeft, without a loop or recursion.
 */
def factorial(n: Int) = {
  if(n < 1) 1
  else (1 to n).reduceLeft(_ * _)
}

// Or even better
def factorial2(n: Int) = (1 to n).product


factorial(10)
factorial2(10)