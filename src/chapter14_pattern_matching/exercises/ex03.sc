/*
  Exercise 3:
  Using pattern matching, write a function
  swap that swaps the first two elements
  of an array provided its length is at
  least two.
 */
def swap(arr: Array[Int]): Array[Int] = arr match {
  case Array(first,second) => Array(second,first)
  case Array(first,second,rest @ _*) => Array(second,first) ++ rest
  case _ => arr
}

swap(Array(1))
swap(Array(1,2))
swap(Array(1,2,3))
swap(Array(1,2,3,4))