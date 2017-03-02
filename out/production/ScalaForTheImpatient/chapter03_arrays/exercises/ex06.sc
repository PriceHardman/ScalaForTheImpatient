/*
  How do you rearrange the elements of an Array[Int] so that they appear in
  reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
 */

import scala.collection.mutable.ArrayBuffer

Array(1,2,3,4,5).reverse
ArrayBuffer(1,2,3,4,5).reverse

// Or manually:
val a = Array(1,2,3,4,5)
for(i <- a.indices) yield a(a.length - i - 1)