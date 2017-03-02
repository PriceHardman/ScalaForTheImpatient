/*
  Repeat the preceding assignment,
  but produce a new array with the swapped values. Use for/yield.
 */


// Strategy: Get the indices using
// powers of -1, a la alternating series.

val a = Array(1,2,3,4,5)

for(i <- a.indices) yield {
  if (i == a.length-1 && i%2==0) a(i) // prevent index out of bounds for odd-length arrays
  else a(i + math.pow(-1,i).toInt)
}