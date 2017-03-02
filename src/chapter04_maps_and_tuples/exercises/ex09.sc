/*
  Write a function lteqgt(values: Array[Int], v: Int) that
  returns a triple containing the counts of values
  less than v, equal to v, and greater than v.
 */

def lteggt(values: Array[Int], v: Int): (Int,Int,Int) ={
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
}

lteggt(Array(1,2,3,4,5,6,7),4)