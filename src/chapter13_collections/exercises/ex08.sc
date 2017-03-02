/*
  Write a function that turns an array
  of Double values into a two- dimensional
  array. Pass the number of columns as a
  parameter. For example, with
    Array(1, 2, 3, 4, 5, 6)
  and three columns, return
    Array(Array(1, 2, 3), Array(4, 5, 6)).
  Use the grouped method.
 */
def toMatrix(x: Array[Double],nCols: Int): Array[Array[Double]] = {
  x.grouped(nCols).toArray
}

toMatrix(Array(1,2,3,4,5,6),3)