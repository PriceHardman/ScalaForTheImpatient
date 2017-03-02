/*
  Write a function minmax(values: Array[Int]) that
  returns a pair containing the smallest and
  largest values in the array.
 */

def minmax(values: Array[Int]): (Int,Int) = {
  (values.min,values.max)
}

minmax(Array(4,6,8,1,2,7,3,4)) // => (1,8)