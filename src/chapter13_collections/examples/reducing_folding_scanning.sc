// Map applies a unary function to all elements of a collection:
(1 to 10).map(x => if(x%2==0) "even" else "odd")

// Reducing, folding, and scanning combine elements in a collection
// by means of binary functions.

// reduceLeft applies operations starting from the left
// of the collection:
List(1,7,2,9).reduceLeft(_ - _) // (((1-7)-2)-9) = -17
// Whereas reduceRight applies operations starting from
// the right
List(1,7,2,9).reduceRight(_ - _) // (1-(7-(2-9))) = -13

// There's only a difference between the result of
// reduceLeft and reduceRight of the operation is
// not commutative (i.e. if f(a,b) != f(b,a)).


// FoldLeft and foldRight are like their reduce counterparts,
// but they allow us to start with an initial value
List(1,7,2,9).foldLeft(0)(_ - _) // 0-1-7-2-9 = -19
List(1,7,2,9).foldRight(0)(_ - _) // (1-(7-(2-(9-0)))) = -13