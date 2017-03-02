/*
  Given an array of integers, produce a new array that
  contains all positive values of the original array,
  in their original order,
  followed by all values that are zero or negative,
  in their original order.
 */

val a = Array(3,-3,1,-1,5,-5)
a.sortBy(_ < 0)