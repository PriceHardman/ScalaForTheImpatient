/*
  Write a loop that swaps adjacent elements of an
  array of integers. For example,
  Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 */

val a = Array(1,2,3,4,5)



// Loop over the even indices
// swapping a(i) and a(i+1) using
// a temp variable. To avoid
// index out of bounds, don't swap
// if we're on the last element in
// the array.
var tmp: Int = a(0)
for(i <- a.indices if i%2==0) {
  tmp = a(i)
  if(i != a.length-1) {
    a(i) = a(i+1)
    a(i+1) = tmp
  }
}

a
