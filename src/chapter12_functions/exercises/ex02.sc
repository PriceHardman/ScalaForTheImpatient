/*
  Exercise 2: How do you get the largest element
  of an array with reduceLeft?
 */

val X = Array(1,2,3,4,5,4,3,2,1)
X.reduceLeft((a,b) => if(a >= b) a else b)