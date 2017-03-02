/*
  For arrays whose size doesn't need to change,
  use the Array type. Internally, these are simply
  Java arrays.
 */
val declared_array = new Array[Int](5) // empty array of 5 integers.
val array_literal = Array(1,2,3,4,5)

array_literal(3) // 4