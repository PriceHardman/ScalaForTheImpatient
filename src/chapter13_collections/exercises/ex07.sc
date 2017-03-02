/*
  In Section 13.11, “Zipping,” on page 171, the
  expression
    (prices zip quantities) map { p => p._1 * p._2 }
  is a bit inelegant. We can’t do
    (prices zip quantities) map { _ * _ }
  because _ * _ is a function with two arguments,
  and we need a function with one argument that
  is a tuple. The tupled method of the Function
  object changes a function with two arguments
  to one that takes a tuple. Apply tupled to the
  multiplication function so you can map it over
  the list of pairs.
 */
val prices = List(1.00,0.99,29.99,1000000.00)
val quantities = List(1,2,3,4)

(prices zip quantities).map(Function.tupled(_ * _))