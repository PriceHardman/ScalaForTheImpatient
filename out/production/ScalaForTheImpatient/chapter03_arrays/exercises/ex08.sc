/*
  Rewrite the example at the end of Section 3.4,
  “Transforming Arrays,” on page 32.
  Collect indexes of the negative elements,
  reverse the sequence, drop the last index,
  and call a.remove(i) for each index.
  Compare the efficiency of this approach
  with the two approaches in Section 3.4.
 */


// Given an ArrayBuffer of integers, remove
// all but the first negative number.

import scala.collection.mutable.ArrayBuffer


// Method 1: Imperative while loop (from section 3.4)
var a = ArrayBuffer(1,2,-3,4,-5,6,-7,8)
var first = true
var n = a.length
var i = 0
while (i < n) {
  if (a(i) >= 0) i += 1 // Keep positive values
  else {
    if (first) {
      // We've found the first negative number
      first = false
      i += 1
    }
    else {
      // Remove all the other negatives.
      a.remove(i)
      n -= 1
    }
  }
}
a

// Method 2:
a = ArrayBuffer(1,2,-3,4,-5,6,-7,8)
a.indices // get the indices
 .filter(a(_) < 0) // filter by indices whose value is negative
 .reverse // reverse the sequence of negative indices
 .dropRight(1) // remove the last one (i.e. remove first negative index)
 .foreach(a.remove(_)) // drop the second and third negative values from a.
a


