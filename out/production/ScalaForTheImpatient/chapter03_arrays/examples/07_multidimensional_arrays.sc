/*
  Like in Java, multidimensional arrays
  are arrays of arrays.
 */
val identity: Array[Array[Int]] = Array(Array(1,0,0),Array(0,1,0),Array(0,0,1))

def trace(A: Array[Array[Int]]): Array[Int] = {
  // Returns a 2d matrix's main diagonal.
  A.indices.map(i => A(i)(i)).toArray
}

trace(identity)