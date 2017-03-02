/*
  To have variable length arrays, we use Array Buffers:
 */

import scala.collection.mutable.ArrayBuffer

val a = ArrayBuffer[Int]()

a += 1 // Add 1 to a

a += 2 // Add 2 to a
a += (3,4,5) // Add 3 4 5

a ++= Array(7,8,9) // Append any collection type with ++=

a.trimEnd(2) // Remove the last two elements.

a // ArrayBuffer(1, 2, 3, 4, 5, 7)

a.insert(5,6) // Insert a 6 index 5.
a // ArrayBuffer(1, 2, 3, 4, 5, 6, 7)


a.insert(4,3,4,5) // insert as many values as you like
a.remove(0) // Remove the first element
a.remove(4,2) // Second arg indicates how many values to remove.

a
a.toArray