/*
  Maps are collections of key-value pairs. Pairs are the simplest case of tuples,
  aggregates of values of different types.

  A tuple value is formed by enclosing individual values in parentheses.
 */
val triple = (1, 3.14, "Fred") // Tuple3[Int, Double, java.lang.String]

// Access components with underscore, one-indexed methods:
triple._1 // => 1


// We can use pattern matching to get at the tuple elements:
val (first,second,third) = triple
first + 1



// Zipping: We can zip collections together element-wise into collections of tuples.
val symbols = Array("<", "-", ">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)
for ((s,n) <- pairs) println(s * n)

// Or we can zip them up into a map:
symbols.zip(counts).toMap